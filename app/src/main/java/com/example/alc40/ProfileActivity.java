package com.example.alc40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
     //define variables
    TextView name_view, track_view, email_view, country_view,
    phone_view, username_view;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //ref the views
        name_view = findViewById(R.id.name_view);
        track_view = findViewById(R.id.track_view);
        country_view = findViewById(R.id.country_view);
        email_view = findViewById(R.id.email_view);
        phone_view = findViewById(R.id.phone_view);
        username_view = findViewById(R.id.username_view);
       imageView = findViewById(R.id.image_view);

        //set data on the views
        name_view.setText(getString(R.string.name));
        track_view.setText(getString(R.string.track));
        country_view.setText(getString(R.string.country));
        email_view.setText(getString(R.string.email));
        phone_view.setText(getString(R.string.number));
        username_view.setText(getString(R.string.name));
       imageView.setImageResource(R.drawable.me);

    }
}
