package com.example.dadriaunna01.takehomeassignment06_dadriaunnaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayText = (TextView) findViewById(R.id.display_view);
        Intent intent = getIntent();

        RecieptInformation a = (RecieptInformation) intent.getSerializableExtra(Keys.NEW_ORDER);
        displayText.setText(a.toString());
    }


}
