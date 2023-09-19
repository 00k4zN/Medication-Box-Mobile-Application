package com.example.proje.ilackayitformu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proje.R;

public class IlacKayitFormuActivity extends AppCompatActivity {

    private EditText medicationNameEditText;
    private Spinner medicationTypeSpinner;
    private Button saveButton;

    private String[] medicationTypes = {"Tablet", "Şurup", "Kapsül", "Enjeksiyon", "Krem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilac_kayit_formu);

        // Arayüz elemanlarını bağlama
        medicationNameEditText = findViewById(R.id.medicationNameEditText);
        medicationTypeSpinner = findViewById(R.id.medicationTypeSpinner);
        saveButton = findViewById(R.id.saveButton);

        // İlaç türlerini göstermek için adapter oluşturma
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, medicationTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medicationTypeSpinner.setAdapter(adapter);

        // Kaydet butonuna tıklama işlemi
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String medicationName = medicationNameEditText.getText().toString();
                String medicationType = medicationTypeSpinner.getSelectedItem().toString();

                // Geri dönüş yapmak için Intent oluşturma ve verileri ekleme
                Intent resultIntent = new Intent();
                resultIntent.putExtra("medicationName", medicationName);
                resultIntent.putExtra("medicationType", medicationType);
                setResult(RESULT_OK, resultIntent);

                // Aktiviteyi sonlandırma
                finish();
            }
        });
    }
}
