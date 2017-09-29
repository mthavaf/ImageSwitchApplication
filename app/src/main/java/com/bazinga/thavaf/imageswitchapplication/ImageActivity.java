package com.bazinga.thavaf.imageswitchapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(getIntent().getIntExtra("IMAGE_ID", R.drawable.wrong));
    }
}
