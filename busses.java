package com.example.nothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class busses extends AppCompatActivity {
    Button makm,mtnagar,man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busses);
        makm=findViewById(R.id.akm);
        mtnagar=findViewById(R.id.T_nagar);
        man=findViewById(R.id.annanagar);

        makm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/Arakkonam,+Tamil+Nadu/Saveetha+Engineering+College,+Saveetha+Nagar,+Chennai+-+Bengaluru+National+Highways+Sriperumbadur+Taluk,+Chennai,+Tamil+Nadu+602105/@13.0162337,79.7036607,11z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3a52bc2d60d615b1:0x82ed0176fa1df9c!2m2!1d79.6704128!2d13.0840593!1m5!1m1!1s0x3a52605c8001b0b3:0x17397b086e047e7c!2m2!1d80.0163351!2d13.0262508!3e0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        mtnagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/T+Nagar,+Chennai,+Tamil+Nadu/Saveetha+Engineering+College,+Saveetha+Nagar,+Chennai+-+Bengaluru+National+Highways+Sriperumbadur+Taluk,+Chennai,+Tamil+Nadu+602105/@13.0424347,80.0559787,12z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3a526655a5da2371:0x4954f49743f04af0!2m2!1d80.2340761!2d13.0417591!1m5!1m1!1s0x3a52605c8001b0b3:0x17397b086e047e7c!2m2!1d80.0163351!2d13.0262508!3e0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/Anna+Nagar,+Chennai,+Tamil+Nadu/Saveetha+Engineering+College,+Saveetha+Nagar,+Chennai+-+Bengaluru+National+Highways+Sriperumbadur+Taluk,+Chennai,+Tamil+Nadu+602105/@13.0548243,80.0773431,13z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3a5264078822719b:0xbda01077b89581e2!2m2!1d80.2101342!2d13.0849557!1m5!1m1!1s0x3a52605c8001b0b3:0x17397b086e047e7c!2m2!1d80.0163351!2d13.0262508!3e0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}