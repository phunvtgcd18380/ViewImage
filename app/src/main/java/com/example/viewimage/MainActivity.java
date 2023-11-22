package com.example.viewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button previous,next;
    int image[] = {R.drawable._556499,R.drawable.istockphoto_1337144146_612x612,R.drawable.pngtree_cartoon_color_simple_male_avatar_png_image_5230557};
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        previous = (Button) findViewById(R.id.previous);
        next = (Button) findViewById(R.id.next);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void buttonClicked(View v)
    {

        int id = v.getId();
        if(id == R.id.next)
        {
            if(count < 0)
            {
                count = 0;
            }
            if(count < image.length) {
                imageView.setImageResource(image[count]);
                count++;
            }
            else if(count == image.length)
            {
                count = 0;
            }
            Log.d("count",Integer.toString(count));
        }
        if(id == R.id.previous)
        {
            if(count > image.length -1)
            {
                count = image.length-1;
            }
            if(count >= 0) {
                imageView.setImageResource(image[count]);
                count--;
            }
            Log.d("count",Integer.toString(count));
        }
    }
}