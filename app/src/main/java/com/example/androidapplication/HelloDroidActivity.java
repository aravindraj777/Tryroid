package com.example.androidapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


public class HelloDroidActivity extends AppCompatActivity {

    private TextView message;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.clickCounter);
        ImageView droid = findViewById(R.id.droidImage);

//        Define and attach click listener
        droid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tapDroid();
            }
        });
    }

    private void tapDroid(){
        counter++;
        String countAsText;

        /*
          In real application you should now write switch like the one below
          Use resource of type "Quantity strings (plurals)" instead
         */

        switch (counter){
            case 1:
                countAsText = "once";
                break;
            case 2:
                countAsText = "twice";
                break;
            default:
                countAsText = String.format("%d times", counter);
        }
        message.setText(String.format("You touched the droid %s", countAsText));
    }
}


























