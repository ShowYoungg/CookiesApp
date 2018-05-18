package com.example.android.cookies;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variables to be used inside changeImage()
     */

    //This serves as a switch which resets the app to default state
    boolean reset = true;

    //This captures the ImageView id in the xml file so that it can be referenced
    ImageView image;

    //This captures the TextView id in the xml file so that it can be referenced
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when "Eat Cookie" button is clicked
     * @param view
     */
   public void setCookie(View view ){
       // reset is initialised to true at declaration, and if true or false, it changes the image and text
       if (reset) {
           image = findViewById(R.id.image_before);
           image.setImageResource(R.drawable.after_cookie);
           txt = findViewById(R.id.txt);
           txt.setText(R.string.after);
           reset = false;
       } else {
           image = findViewById(R.id.image_before);
           image.setImageResource(R.drawable.before_cookie);
           txt = findViewById(R.id.txt);
           txt.setText(R.string.before);
           reset = true ;
       }
   }
}
