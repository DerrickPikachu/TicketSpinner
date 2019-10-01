package com.example.ticketspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    class MainActivityListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String[] cinemasName = getResources().getStringArray(R.array.cinemas);
           result.setText("訂" + cinemasName[cinemas.getSelectedItemPosition()] + "的票");
        }
    }

    Spinner cinemas;
    TextView result;
    Button bookBtn;
    MainActivityListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cinemas = findViewById(R.id.cinemasSpinner);
        result = findViewById(R.id.resultText);
        bookBtn = findViewById(R.id.bookBtn);
        listener = new MainActivityListener();

        bookBtn.setOnClickListener(listener);
    }
}
