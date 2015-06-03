package com.sengopal.learn.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<Button, Integer> toastMsg = new HashMap<>();
        toastMsg.put((Button) findViewById(R.id.spotify_button), R.string.spotify_toast);
        toastMsg.put((Button) findViewById(R.id.scores_button), R.string.scores_toast);
        toastMsg.put((Button) findViewById(R.id.library_button), R.string.library_toast);
        toastMsg.put((Button) findViewById(R.id.build_bigger_button), R.string.build_bigger_toast);
        toastMsg.put((Button) findViewById(R.id.reader_button), R.string.reader_toast);
        toastMsg.put((Button) findViewById(R.id.capstone_button), R.string.capstone_toast);


        for(final Map.Entry<Button, Integer> entry : toastMsg.entrySet()) {
            entry.getKey().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this.getApplicationContext(), entry.getValue(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    */
}
