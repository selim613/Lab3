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

    public void button00Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

    public void button01Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void button02Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }

    public void button03Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }

    public void button04Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }

    public void button05Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }

    public void button06Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }

    public void button07Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }

    public void button08Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }

    public void button09Click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }

    public void buttonDivClick(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "/");
    }

    public void buttonMultClick(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "*");
    }

    public void buttonSubClick(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "-");
    }

    public void buttonAddClick(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "+");
    }

    public void buttonDotClick(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }

}