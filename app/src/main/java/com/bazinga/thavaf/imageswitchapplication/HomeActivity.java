package com.bazinga.thavaf.imageswitchapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageName = editText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), ImageActivity.class);
                intent.putExtra("IMAGE_ID", getImageId(imageName));
                startActivity(intent);
            }
        });
    }

    public int getImageId(String name){
        switch(name){
            case "minion":
                return R.drawable.minion;
            case "agnes":
                return R.drawable.agnes;
        }
        return R.drawable.wrong;
    }
}
