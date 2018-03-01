package com.occ.rss.thimble_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
     private Button bouton1 = null;
     private Button bouton2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton1 = (Button)findViewById(R.id.btn1);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MainActivity.this,Roll_Activity.class);
                MyIntent.putExtra("max",6);
                startActivity(MyIntent);
            }
        });
        bouton2 = (Button)findViewById(R.id.btn2);
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MainActivity.this,Roll_Activity.class);
                MyIntent.putExtra("max", 20);
                startActivity(MyIntent);
            }
        });
    }
}
