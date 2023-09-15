package com.arhamnasir.i191962;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button photoButton = findViewById(R.id.photoButton);
        final Button videoButton = findViewById(R.id.videoButton);

        // Set initial text colors
        photoButton.setTextColor(getResources().getColor(R.color.text_color_default));
        videoButton.setTextColor(getResources().getColor(R.color.text_color_default));

        // Set click listeners to change text colors
        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text color when photoButton is clicked
                photoButton.setTextColor(getResources().getColor(R.color.text_color_pressed));
                videoButton.setTextColor(getResources().getColor(R.color.text_color_default));

                // Add your logic to handle the "Photos" button click action here
            }
        });
    }
}