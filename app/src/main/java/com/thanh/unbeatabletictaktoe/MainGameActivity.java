package com.thanh.unbeatabletictaktoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainGameActivity extends AppCompatActivity {

    boolean isClicked = false;
    int[] colors = {Color.RED, Color.BLUE};
    int count = 0;
    int currentColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        final Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b1.setBackgroundColor(currentColor);
            }
        });
        final Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b2.setBackgroundColor(currentColor);
            }
        });
        final Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b3.setBackgroundColor(currentColor);
            }
        });
        final Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b4.setBackgroundColor(currentColor);
            }
        });
        final Button b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b5.setBackgroundColor(currentColor);
            }
        });
        final Button b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b6.setBackgroundColor(currentColor);
            }
        });
        final Button b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b7.setBackgroundColor(currentColor);
            }
        });
        final Button b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b8.setBackgroundColor(currentColor);
            }
        });
        final Button b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColor = colors[count % 2];
                count++;
                b9.setBackgroundColor(currentColor);
            }
        });

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b1.setBackgroundColor(Color.BLUE);
//            }
//        });
    }

    private void buttonClick(Button button) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
