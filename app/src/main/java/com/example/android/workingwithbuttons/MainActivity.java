package com.example.android.workingwithbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void simpleButton(View button) {
        Toast.makeText(this, "This is a Simple Button", Toast.LENGTH_SHORT).show();
    }

    public void leftIconButton(View button) {
        Toast.makeText(this, "This is a Button \nWith an Icon on the Left", Toast.LENGTH_SHORT).show();
    }

    public void rightIconButton(View view) {
        Toast.makeText(this, "This is a Button\nWith an Icon on the Right", Toast.LENGTH_SHORT).show();
    }

}
