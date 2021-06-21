package com.example.android_doc_implementation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import kotlin.reflect.KFunction;

// aktifity pertama saat aplikasi dijalankan
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        TextView txtHello
//    }
//}
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox checkbox1, checkbox2, checkbox3;
    private RadioGroup statusMenikah;
    private ProgressBar progressBar, progressBar2;
    private ListView listKota;
    private Spinner listMuridSpinner;
    private Spinner listMuridSpinner2;

    // click kanan generate
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //            case R.id.buttonTestClick:
            //                System.out.println("ubah nama APP");
            //                Toast.makeText(this, "Button ubah nama app clicked", Toast.LENGTH_SHORT).show();
            //                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // learn episode 1
        //        TextView txtHello = findViewById(R.id.textMessage);
        //        txtHello.setText("halo dunia");


        //        // set onBtnClick tidak dari xml
        //        Button btnClick = findViewById(R.id.btnUbahNamaApp);
        //        // Ubah Pake Interface
        //        //        btnClick.setOnClickListener(new View.OnClickListener() {
        //        //            @Override
        //        //            public void onClick(View view) {
        //        //                System.out.println("halo");
        //        //            }
        //        //        });
        //        // menggunakan interface method onClick
        //        btnClick.setOnClickListener(this);
        //        // long click
        //        btnClick.setOnLongClickListener(new View.OnLongClickListener() {
        //            @Override
        //            public boolean onLongClick(View view) {
        //                Toast.makeText(MainActivity.this, "Button sedang di tekan yang lama", Toast.LENGTH_SHORT).show();
        //                return true;
        //            }
        //        });


        //        checkbox1 = findViewById(R.id.checkbox1);
        //        checkbox2 = findViewById(R.id.checkbox2);
        //        checkbox3 = findViewById(R.id.checkbox3);
        //        if (checkbox1.isChecked()) {
        //            Toast.makeText(this, "Kamu check checkbox 1 1", Toast.LENGTH_SHORT).show();
        //        } else {
        //            Toast.makeText(this, "Kamu uncheck checkbox 1 1", Toast.LENGTH_SHORT).show();
        //        }
        //        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        //            @Override
        //            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //                if (b){
        //                    Toast.makeText(MainActivity.this, "Kamu checked checkbox 1", Toast.LENGTH_SHORT).show();
        //                } else {
        //                    Toast.makeText(MainActivity.this, "Kamu uncheck checkbox 1", Toast.LENGTH_SHORT).show();
        //                }
        //            }
        //        });
        //        statusMenikah = findViewById(R.id.radioGroupStatusMenikah);
        //        progressBar = findViewById(R.id.progressBar);
        //        progressBar2 = findViewById(R.id.progressBar2);
        //        Thread thread = new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                for(int i=0; i < 10; i++){
        //                    progressBar2.incrementProgressBy(10);
        //                    System.out.println("progress bar"+ progressBar2.getProgress());
        //                    if (progressBar2.getProgress() == 100){
        //                        // try to touch View of UI thread
        //                        runOnUiThread(new Runnable() {
        //                            @Override
        //                            public void run() {
        //                                progressBar2.setVisibility(View.GONE);
        //                            }
        //                        });
        //                    }
        //                    SystemClock.sleep(500);
        //                }
        //            }
        //        });
        //        thread.start();
        //        int checkedButton = statusMenikah.getCheckedRadioButtonId();
        //        switch (checkedButton){
        //            case R.id.radioButtonMenikah:
        //                Toast.makeText(MainActivity.this, "Menikah", Toast.LENGTH_SHORT).show();
        //                break;
        //            case R.id.radioButtonBelumMenikah:
        //                Toast.makeText(MainActivity.this, "Belum Menikah", Toast.LENGTH_SHORT).show();
        //                break;
        //            default:
        //                break;
        //        }
        //        statusMenikah.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        //            @Override
        //            public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //                switch (i) {
        //                    case R.id.radioButtonMenikah:
        //                        Toast.makeText(MainActivity.this, "Menikah", Toast.LENGTH_SHORT).show();
        //                        progressBar.setVisibility(View.GONE);
        //                        break;
        //                    case R.id.radioButtonBelumMenikah:
        //                        Toast.makeText(MainActivity.this, "Belum Menikah", Toast.LENGTH_SHORT).show();
        //                        progressBar.setVisibility(View.VISIBLE);
        //                        break;
        //                    default:
        //                        break;
        //                }
        //            }
        //        });
        listKota = findViewById(R.id.listKota);
        final ArrayList<String> kotaData = new ArrayList<>();
        kotaData.add("Tangerang");
        kotaData.add("Tangerang Selatan");
        kotaData.add("Jakarta Barat");
        kotaData.add("Jakarta Timur");

        ArrayAdapter<String> kotaDataAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                kotaData
        );
        listKota.setAdapter(kotaDataAdapter);
        listKota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, kotaData.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        listMuridSpinner = findViewById(R.id.listMuridSpinner);
        ArrayList<String> muridData = new ArrayList<>();
        muridData.add("Jaka");
        muridData.add("prima");
        muridData.add("Maulana");

        ArrayAdapter<String> muridDataAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            muridData
        );
        listMuridSpinner.setAdapter(muridDataAdapter);
        listMuridSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, muridData.get(i), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        listMuridSpinner2 = findViewById(R.id.listMuridSpinner2);

        listMuridSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, listMuridSpinner2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    //    public void onBtnRegisterClick(View view) {
    //        // learn episode 1
    //        //        TextView txtHello = findViewById(R.id.textMessage);
    //        //        EditText editTextName = findViewById(R.id.editTxtName);
    //        //        txtHello.setText("Hello "+ editTextName.getText().toString());
    //
    //        // learn episode 2
    //        EditText editFirstName = findViewById(R.id.editTextFirstname);
    //        EditText editLastName = findViewById(R.id.editTextLastName);
    //        EditText editEmail = findViewById(R.id.editTextEmail);
    //
    //        TextView textFirstName = findViewById(R.id.textFirstName);
    //        TextView textLastName = findViewById(R.id.textLastName);
    //        TextView textEmail = findViewById(R.id.textEmail);
    //
    //        textFirstName.setText(editFirstName.getText().toString());
    //        textLastName.setText(editLastName.getText().toString());
    //        textEmail.setText(editEmail.getText().toString());
    //    }

    // set dari XML
    //    public void onBtnClick(View view){
    //        TextView appNama = findViewById(R.id.appNama);
    //        appNama.setText("nama aplikasi saya");
    //    }

}