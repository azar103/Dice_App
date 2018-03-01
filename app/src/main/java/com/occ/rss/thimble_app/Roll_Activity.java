package com.occ.rss.thimble_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by user on 01/03/2018.
 */

public class Roll_Activity extends Activity {
    private  TextView result =  null;
    private Button bouton = null;
    private int max = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);
        max = getIntent().getIntExtra("max", 0);
        TextView title = (TextView)findViewById(R.id.title);
        title.setText(max+" sided dice");
        result = (TextView)findViewById(R.id.result);
        result.setText("");
        bouton = (Button)findViewById(R.id.btn_roll);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int nombreAleatoire = rand.nextInt(max)+1;

                result.setText(String.valueOf(nombreAleatoire));

            }
        });
    }

}
