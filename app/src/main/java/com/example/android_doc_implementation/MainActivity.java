package com.example.android_doc_implementation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.jetbrains.annotations.NotNull;

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
    private FloatingActionButton fab;
    private Button buttonSnackBar;
    private ConstraintLayout parent;
    private MaterialCardView cardView;
    private RecyclerView contactRecyclerView;
    ImageView gambarProfile;


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



        //        listKota = findViewById(R.id.listKota);
        //        final ArrayList<String> kotaData = new ArrayList<>();
        //        kotaData.add("Tangerang");
        //        kotaData.add("Tangerang Selatan");
        //        kotaData.add("Jakarta Barat");
        //        kotaData.add("Jakarta Timur");
        //
        //        ArrayAdapter<String> kotaDataAdapter = new ArrayAdapter<>(
        //                this,
        //                android.R.layout.simple_list_item_1,
        //                kotaData
        //        );
        //        listKota.setAdapter(kotaDataAdapter);
        //        listKota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //            @Override
        //            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //                Toast.makeText(MainActivity.this, kotaData.get(i), Toast.LENGTH_SHORT).show();
        //            }
        //        });
        //
        //        listMuridSpinner = findViewById(R.id.listMuridSpinner);
        //        ArrayList<String> muridData = new ArrayList<>();
        //        muridData.add("Jaka");
        //        muridData.add("prima");
        //        muridData.add("Maulana");
        //
        //        ArrayAdapter<String> muridDataAdapter = new ArrayAdapter<>(
        //            this,
        //            android.R.layout.simple_spinner_dropdown_item,
        //            muridData
        //        );
        //        listMuridSpinner.setAdapter(muridDataAdapter);
        //        listMuridSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //            @Override
        //            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //                Toast.makeText(MainActivity.this, muridData.get(i), Toast.LENGTH_SHORT).show();
        //            }
        //            @Override
        //            public void onNothingSelected(AdapterView<?> adapterView) {
        //
        //            }
        //        });
        //
        //        listMuridSpinner2 = findViewById(R.id.listMuridSpinner2);
        //        listMuridSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //            @Override
        //            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //                Toast.makeText(MainActivity.this, listMuridSpinner2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        //            }
        //
        //            @Override
        //            public void onNothingSelected(AdapterView<?> adapterView) {
        //
        //            }
        //        });



        // setting bahasa ada di res/values/strings
        //        TextView language = findViewById(R.id.language);
        //        language.setText(R.string.language);


        //        fab = findViewById(R.id.fab);
        //        fab.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                Toast.makeText(MainActivity.this, "Floating button clicked", Toast.LENGTH_SHORT).show();
        //            }
        //        });
        //        parent = findViewById(R.id.parent);
        //        buttonSnackBar = findViewById(R.id.buttonSnackBar);
        //        buttonSnackBar.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                showSnackBar();
        //            }
        //        });
        //
        //        cardView = findViewById(R.id.cardView);
        //        cardView.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                Toast.makeText(MainActivity.this, "card clicked", Toast.LENGTH_SHORT).show();
        //            }
        //        });


        //        RecyclerView
//        contactRecyclerView = findViewById(R.id.contactRecyclerView);
//        ArrayList<Contact> contacts = new ArrayList<>();
//        contacts.add(new Contact("jaka", "jaka@primasaja.com", "https://i1.sndcdn.com/avatars-000229121733-8pm0sf-t500x500.jpg"));
//        contacts.add(new Contact("prima", "admin@primasaja.com", "https://i1.sndcdn.com/avatars-000229121733-8pm0sf-t500x500.jpg"));
//        contacts.add(new Contact("maulana", "maulana@primasaja.com", "https://i1.sndcdn.com/avatars-000229121733-8pm0sf-t500x500.jpg"));

        gambarProfile = findViewById(R.id.gambarProfile);
        Glide.with(MainActivity.this).load("http://goo.gl/gEgYUd").into(gambarProfile);
        //        gambarProfile = findViewById(R.id.gambarProfile);
        //        Glide.with(MainActivity.this)
        //                .asBitmap()
        //                .load("https://i1.sndcdn.com/avatars-000229121733-8pm0sf-t500x500.jpg")
        //                .into(gambarProfile);

        //        ContactsRecycleViewAdapter adapter = new ContactsRecycleViewAdapter(this);
        //        adapter.setContacts(contacts);
        //        contactRecyclerView.setAdapter(adapter);
        //        // vertical implementation data new LinearLayoutManager(this)
        //        // kalo mau horizontal new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false) (bisa ditarik kaya slider)
        //        // grid layout new GridLayoutManager(this, 2))
        //        contactRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //        System.out.println("7");
    }

    private void showSnackBar(){
        Snackbar.make(parent, "This is snackbar", Snackbar.LENGTH_SHORT)
                .setAction("retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Retry Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.blue_500))
                .setTextColor(Color.RED)
                .show();
    }

    // ctrl + o untuk melihat semua method yang ada
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
        //        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settingsMenu:
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.alarm:
                Toast.makeText(this, "Alarm Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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