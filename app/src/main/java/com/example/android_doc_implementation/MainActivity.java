package com.example.android_doc_implementation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // learn episode 1
        //        TextView txtHello = findViewById(R.id.textMessage);
        //        txtHello.setText("halo dunia");
    }

    public void onBtnRegisterClick(View view) {
        // learn episode 1
        //        TextView txtHello = findViewById(R.id.textMessage);
        //        EditText editTextName = findViewById(R.id.editTxtName);
        //        txtHello.setText("Hello "+ editTextName.getText().toString());

        // learn episode 2
        EditText editFirstName = findViewById(R.id.editTextFirstname);
        EditText editLastName = findViewById(R.id.editTextLastName);
        EditText editEmail = findViewById(R.id.editTextEmail);

        TextView textFirstName = findViewById(R.id.textFirstName);
        TextView textLastName = findViewById(R.id.textLastName);
        TextView textEmail = findViewById(R.id.textEmail);

        textFirstName.setText(editFirstName.getText().toString());
        textLastName.setText(editLastName.getText().toString());
        textEmail.setText(editEmail.getText().toString());
    }
}