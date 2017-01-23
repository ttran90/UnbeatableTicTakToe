package com.thanh.unbeatabletictaktoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainGameActivity extends AppCompatActivity implements View.OnClickListener{

    int[] colors = {Color.RED, Color.BLUE};
    int count = 0;
    int currentColor;
    Player player1 = new Player("Player1");
    Player player2 = new Player("Player2");
    Player[] players = {player1, player2};
    Game game = new Game(player1, player2);
    boolean isOver = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        TextView textView = (TextView) findViewById(R.id.textBox);
        textView.setText(players[count % 2].getName() + "'s turn");


        final Button b1 = (Button) findViewById(R.id.button);
        final Button b2 = (Button) findViewById(R.id.button2);
        final Button b3 = (Button) findViewById(R.id.button3);
        final Button b4 = (Button) findViewById(R.id.button4);
        final Button b5 = (Button) findViewById(R.id.button5);
        final Button b6 = (Button) findViewById(R.id.button6);
        final Button b7 = (Button) findViewById(R.id.button7);
        final Button b8 = (Button) findViewById(R.id.button8);
        final Button b9 = (Button) findViewById(R.id.button9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                buttonClicked((Button)findViewById(R.id.button),1);
                break;
            case R.id.button2:
                buttonClicked((Button)findViewById(R.id.button2),2);
                break;
            case R.id.button3:
                buttonClicked((Button)findViewById(R.id.button3),3);
                break;
            case R.id.button4:
                buttonClicked((Button)findViewById(R.id.button4),4);
                break;
            case R.id.button5:
                buttonClicked((Button)findViewById(R.id.button5),5);
                break;
            case R.id.button6:
                buttonClicked((Button)findViewById(R.id.button6),6);
                break;
            case R.id.button7:
                buttonClicked((Button)findViewById(R.id.button7),7);
                break;
            case R.id.button8:
                buttonClicked((Button)findViewById(R.id.button8),8);
                break;
            case R.id.button9:
                buttonClicked((Button)findViewById(R.id.button9),9);
                break;

        }
    }

    private void buttonClicked(Button button, int move) {
        TextView textView = (TextView)findViewById(R.id.textBox);
        currentColor = colors[count % 2];
        button.setBackgroundColor(currentColor);
        isOver = game.play(players[count % 2], move);
        count++;
        textView.setText(players[count % 2].getName() + "'s turn");
        if(isOver){
            textView.setText(players[(count - 1) % 2].getName().toUpperCase() + " WON!!!!!");
        }
    }
}
