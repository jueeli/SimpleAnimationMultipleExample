package com.example.mii_android2.practiceapplication.frame_animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mii_android2.practiceapplication.R;

/**
 * Created by mii-android2 on 1/7/16.
 */
public class FrameAnimation extends AppCompatActivity {
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        click= (Button) findViewById(R.id.btn_Click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFrameAnimation(view);
            }
        });
    }

        public void startFrameAnimation(View view){
            ImageView frame= (ImageView) findViewById(R.id.img_ball);
            frame.setBackgroundResource(R.drawable.frame);

            AnimationDrawable frameDrawable= (AnimationDrawable) frame.getBackground();

            if (frameDrawable.isRunning()){
                frameDrawable.stop();
            }else
            {
                frameDrawable.stop();
                frameDrawable.start();
            }
        }
}