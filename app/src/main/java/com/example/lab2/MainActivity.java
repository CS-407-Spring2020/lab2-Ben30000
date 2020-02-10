package com.example.lab2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void button1Clicked(View view) {
        //Log.i( "Info", "Button Pressed");
        EditText aTextField = (EditText) findViewById(R.id.textField1);
        String s = aTextField.getText().toString();
        //Toast.makeText(MainActivity.this,aTextField.getText().toString(),Toast.LENGTH_LONG).show();
        goToActivity2(s);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
