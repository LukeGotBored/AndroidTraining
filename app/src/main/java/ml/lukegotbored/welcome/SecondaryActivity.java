package ml.lukegotbored.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {
    Context layoutRoot;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondaryactivity);
        layoutRoot = getApplicationContext();
        name = findViewById(R.id.nameView);

        name.setText(getIntent().getStringExtra("USERNAME"));

    }
}