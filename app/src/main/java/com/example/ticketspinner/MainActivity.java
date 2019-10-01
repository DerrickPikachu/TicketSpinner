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
            String[] timeStr = getResources().getStringArray(R.array.time);
            result.setText("訂" + cinemasName[cinemas.getSelectedItemPosition()] + timeStr[timeSpinner.getSelectedItemPosition()] +"的票");
        }
    }

    Spinner cinemas, timeSpinner;
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
        timeSpinner = findViewById(R.id.timeSpinner);

        bookBtn.setOnClickListener(listener);
    }
}
