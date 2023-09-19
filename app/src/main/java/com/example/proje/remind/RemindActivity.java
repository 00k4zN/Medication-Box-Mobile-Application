package com.example.proje.remind;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.proje.R;

import java.util.Calendar;

public class RemindActivity extends AppCompatActivity {

    private TextView medicationNameTextView;
    private TimePicker timePicker;
    private Button setReminderButton;

    private static final String CHANNEL_ID = "medication_reminder_channel";
    private static final int NOTIFICATION_ID = 1;
    private static final int PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remind_activity);

        medicationNameTextView = findViewById(R.id.medicationNameTextView);
        timePicker = findViewById(R.id.timePicker);
        setReminderButton = findViewById(R.id.setReminderButton);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String medicationName = extras.getString("medicationName");
            medicationNameTextView.setText(medicationName);
        }

        setReminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour, minute;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                } else {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                }

                requestNotificationPermission(hour, minute);
            }
        });
    }

    private void requestNotificationPermission(int hour, int minute) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.VIBRATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.VIBRATE}, PERMISSION_REQUEST_CODE);
        } else {
            setMedicationReminder(hour, minute);
        }
    }

    private void setMedicationReminder(int hour, int minute) {
        // Hatırlatıcıyı ayarlamak için gerekli işlemleri gerçekleştirin
        // Burada bildirim oluşturma ve zamanlamayı ayarlama kodu yer almalıdır
        // İlgili ilaca ait hatırlatma zamanı saat ve dakika değerleri ile birlikte kullanılabilir

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("İlaç Hatırlatıcısı")
                .setContentText("Hatırlatma: " + medicationNameTextView.getText().toString())
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Medication Reminder";
            String description = "Channel for medication reminders";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            channel.enableLights(true);
            channel.setLightColor(Color.BLUE);
            notificationManagerCompat.createNotificationChannel(channel);
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManagerCompat.notify(NOTIFICATION_ID, builder.build());

        Toast.makeText(this, "Hatırlatıcı ayarlandı", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                int hour, minute;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                } else {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                }
                setMedicationReminder(hour, minute);
            } else {
                Toast.makeText(this, "Bildirim izni reddedildi.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
