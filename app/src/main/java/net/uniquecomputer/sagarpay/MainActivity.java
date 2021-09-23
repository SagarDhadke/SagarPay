package net.uniquecomputer.sagarpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameText,NumberText;
    private Button button;
    private String name;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameText = findViewById(R.id.mName);
        NumberText = findViewById(R.id.mNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }
    public void sendData()
    {
        name = nameText.getText().toString().trim();
        number = Integer.parseInt(NumberText.getText().toString().trim());

        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        i.putExtra(MainActivity2.NAME,name);
        i.putExtra(MainActivity2.NUMBER,number);

        startActivity(i);




    }
}