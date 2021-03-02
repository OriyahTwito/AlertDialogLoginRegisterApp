package com.example.alertdialogloginregisterapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

// View.OnClickListener - Implementation of the function "onClick"
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin, btnRegister; // Set Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // The design of MainActivity

        initUI();
        initListeners();
    }

    private void initUI() {
        // Id of Button
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
    }

    private void initListeners() {
        // Give access to elements to be clicked
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    // Performs tasks after click on the elements
    @Override
    public void onClick(View v) {
        // Start AlertDialog with EditText: "User Name", "Password"
        if (v.getId() == R.id.btnLogin) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            linearLayout.setOrientation(LinearLayout.VERTICAL);

            EditText etUserName = new EditText(this);
            EditText etPassword = new EditText(this);

            etUserName.setHint("User Name");
            etPassword.setHint("Password");

            linearLayout.addView(etUserName);
            linearLayout.addView(etPassword);

            alert.setView(linearLayout);

            alert.setPositiveButton("Ok", (dialog, whichButton) -> {
                if (!etUserName.getText().toString().isEmpty() &&
                        !etPassword.getText().toString().isEmpty()) {
                    Toast.makeText(this, "You are taken to the next screen", Toast.LENGTH_LONG).show();
                }
            });

            alert.show();
        }
        // Start AlertDialog with EditText: "First Name", "Last Name", "Phone Number", "User Name", "Password"
        if (v.getId() == R.id.btnRegister) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            linearLayout.setOrientation(LinearLayout.VERTICAL);

            EditText etFirstName = new EditText(this);
            EditText etLastName = new EditText(this);
            EditText etPhoneNumber = new EditText(this);
            EditText etUserName = new EditText(this);
            EditText etPassword = new EditText(this);

            etFirstName.setHint("First Name");
            etLastName.setHint("Last Name");
            etPhoneNumber.setHint("Phone Number");
            etUserName.setHint("User Name");
            etPassword.setHint("Password");

            linearLayout.addView(etFirstName);
            linearLayout.addView(etLastName);
            linearLayout.addView(etPhoneNumber);
            linearLayout.addView(etUserName);
            linearLayout.addView(etPassword);

            alert.setView(linearLayout);

            alert.setPositiveButton("Ok", (dialog, whichButton) -> {
                if (!etFirstName.getText().toString().isEmpty() &&
                        !etLastName.getText().toString().isEmpty() &&
                        !etPhoneNumber.getText().toString().isEmpty() &&
                        !etUserName.getText().toString().isEmpty() &&
                        !etPassword.getText().toString().isEmpty()) {
                    Toast.makeText(this, "You are taken to the next screen", Toast.LENGTH_LONG).show();
                }
            });

            alert.show();
        }
    }

}