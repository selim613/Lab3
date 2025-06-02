package com.example.lab3simplecalculator;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // This string will collect the operations and numbers being typed in
    String display = "";

    public void button00Click(View view) {
        display = display + "0";
        textView();
    }

    public void button01Click(View view) {
        display = display + "1";
        textView();
    }

    public void button02Click(View view) {
        display = display + "2";
        textView();
    }

    public void button03Click(View view) {
        display = display + "3";
        textView();
    }

    public void button04Click(View view) {
        display = display + "4";
        textView();
    }

    public void button05Click(View view) {
        display = display + "5";
        textView();
    }

    public void button06Click(View view) {
        display = display + "6";
        textView();
    }

    public void button07Click(View view) {
        display = display + "7";
        textView();
    }

    public void button08Click(View view) {
        display = display + "8";
        textView();
    }

    public void button09Click(View view) {
        display = display + "9";
        textView();
    }

    public void buttonAddClick(View view) {
        display = display + "+";
        textView();
    }

    public void buttonSubClick(View view) {
        display = display + "-";
        textView();
    }

    public void buttonMultClick(View view) {
        display = display + "×";
        textView();
    }

    public void buttonDivClick(View view) {
        display = display + "÷";
        textView();
    }

    public void buttonDotClick(View view) {
        display = display + ".";
        textView();
    }

    // Method to clear the display
    public void buttonCEClick(View view) {
        display = "";
        textView();
    }

    // Equals method
    public void buttonEqClick(View view) {
        try {
            // iterate through result string
            display ="test";
            textView();
        } catch (Exception e) {
            display = "Invalid Input";
            textView();
        }
    }

    // Instead of typing out the eText object for every class, this method can be called to to update the display (resultEdit)
    public void textView() {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(display);
    }
}