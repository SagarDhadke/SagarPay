package net.uniquecomputer.sagarpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String NUMBER = "NUMBER";
    private TextView nameText,numberText;
    private String name;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameText = findViewById(R.id.Mname);
        numberText = findViewById(R.id.Mnumber);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        number = i.getIntExtra(NUMBER,0);
    }
}

