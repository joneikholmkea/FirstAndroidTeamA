package jon.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

    }
    public void tryPressed(View view){
        System.out.println("You have courage.");
        textView.setText(editText.getText().toString());
        editText.setText("another goal");
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}