package com.siddhantbhatia.camera2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button openCameraBtn;
    Intent cameraActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraActivityIntent = new Intent(getApplicationContext(), CameraActivity.class);

        openCameraBtn = findViewById(R.id.cameraBtn);
        openCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cameraActivityIntent);

            }
        });
    }
}


