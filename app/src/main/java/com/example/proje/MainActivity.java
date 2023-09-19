package com.example.proje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proje.ilackayitformu.IlacKayitFormuActivity;
import com.example.proje.remind.RemindActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView medicationListView;
    private Button addMedicationButton;
    private Button remindButton;
    private ArrayAdapter<String> medicationAdapter;
    private ArrayList<String> medicationList;

    private ActivityResultLauncher<Intent> activityLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Arayüz elemanlarını bağlama
        medicationListView = findViewById(R.id.medicationListView);
        addMedicationButton = findViewById(R.id.addMedicationButton);
        remindButton = findViewById(R.id.remindButton);

        // İlaç listesi ve adaptörü oluşturma
        medicationList = new ArrayList<>();
        medicationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, medicationList);
        medicationListView.setAdapter(medicationAdapter);

        // İlaç ekleme butonuna tıklama işlemi
        activityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                Intent data = result.getData();
                if (data != null) {
                    String medicationName = data.getStringExtra("medicationName");
                    String medicationType = data.getStringExtra("medicationType");

                    String medicationInfo = medicationName + " - " + medicationType;
                    medicationList.add(medicationInfo);
                    medicationAdapter.notifyDataSetChanged();

                    Toast.makeText(MainActivity.this, "İlaç eklendi: " + medicationInfo, Toast.LENGTH_SHORT).show();
                }
            }
        });

        addMedicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IlacKayitFormuActivity.class);
                activityLauncher.launch(intent);
            }
        });

        // İlaçlara uzun tıklama işlemi
        medicationListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                String selectedMedication = medicationList.get(position);
                Toast.makeText(MainActivity.this, "Seçili ilaç: " + selectedMedication, Toast.LENGTH_SHORT).show();

                // İlaçın yanına butonları ekleme
                LinearLayout buttonLayout = findViewById(R.id.buttonLayout);
                buttonLayout.setVisibility(View.VISIBLE);

                Button deleteButton = findViewById(R.id.deleteButton);
                deleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Sil butonuna tıklama işlemi
                        medicationList.remove(position);
                        medicationAdapter.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, "İlaç silindi: " + selectedMedication, Toast.LENGTH_SHORT).show();
                    }
                });

                remindButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Hatırlat butonuna tıklama işlemi
                        Intent intent = new Intent(MainActivity.this, RemindActivity.class);
                        intent.putExtra("medicationName", selectedMedication);
                        startActivity(intent);
                    }
                });

                return true;
            }
        });

    }
}
