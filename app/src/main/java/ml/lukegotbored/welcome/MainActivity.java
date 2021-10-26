package ml.lukegotbored.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button reset, test, play;
    TextInputLayout inputLayout;
    TextInputEditText inputText;
    Context rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = getApplicationContext();

        reset = findViewById(R.id.btnReset);
        play = findViewById(R.id.btnPlay);
        test = findViewById(R.id.btnTest);

        inputLayout = findViewById(R.id.textLayout);
        inputText = findViewById(R.id.textBox);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
    }

    public void delAll(View view){

        if(inputText.getText().length() > 0){
            inputText.setText("");
            Toast.makeText(rootLayout, "Deleted everything!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(rootLayout, "There's nothing to delete!", Toast.LENGTH_SHORT).show();
        }

    }

    public void launchActivity(View view) {
        if(inputText.getText().length() > 0){
            Intent i = new Intent(getApplicationContext(), SecondaryActivity.class);
            i.putExtra("USERNAME", inputText.getText().toString());
            startActivity(i);
        } else {
            Toast.makeText(rootLayout, "Please insert some test!", Toast.LENGTH_LONG).show();
        }


    }
    public void test(View view){
        if(inputText.getText().length() > 0) {
            Toast.makeText(rootLayout, inputText.getText(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(rootLayout, "There's nothing in the input!", Toast.LENGTH_SHORT).show();
        }
    }
}