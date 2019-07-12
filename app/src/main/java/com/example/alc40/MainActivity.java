package com.example.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //View field variables
    private TextView textView;
    private Button aboutButton;
    private Button profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ref the views
        textView = findViewById(R.id.textView);
        aboutButton = findViewById(R.id.about_button);
        profileButton = findViewById(R.id.profile_button);

        //set text on the text view
        textView.setText(getString(R.string.welcome));

        //set Onclick Listener on the button views
        aboutButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.about_button:
                // create an intent
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                break;

            case R.id.profile_button:
                // create an intent
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                startActivity(profileIntent);
                break;
        }
    }
}
