// src/main/java/com/example/yourapp/MainActivity.java
package com.example.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonChange;
    private Button buttonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonChange = findViewById(R.id.buttonChange);
        buttonColor = findViewById(R.id.Color);


        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text color to blue


                // Change text font to custom font
                Typeface newFont = getResources().getFont(R.font.custom_font); // Use your custom font resource
                textView.setTypeface(newFont);

                // Show a toast message
                Toast.makeText(MainActivity.this, "Text Font Updated!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(getResources().getColor(R.color.colorAccent));

                Toast.makeText(MainActivity.this, "Text Color updated!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}