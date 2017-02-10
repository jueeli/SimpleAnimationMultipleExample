package com.example.mii_android2.practiceapplication.simple_animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mii_android2.practiceapplication.R;

public class MainActivity extends AppCompatActivity{

    Button btn_rotate, btn_scale, btn_trans, btn_alpha;
    ImageView img_ball;
    Animation a_rotate, a_scale, a_trans, a_alpha;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_ball = (ImageView) findViewById(R.id.img_ball);

        img_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });


    }
       /* btn_rotate = (Button) findViewById(R.id.btn_rotate);
        btn_scale = (Button) findViewById(R.id.btn_scale);
        btn_trans = (Button) findViewById(R.id.btn_translate);
        btn_alpha = (Button) findViewById(R.id.btn_alpha);

        coordinatorLayout= (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        img_ball = (ImageView) findViewById(R.id.img_ball);

        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                a_rotate.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_rotate);
            }
        });

        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                a_scale.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_scale);
            }
        });

        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_trans = AnimationUtils.loadAnimation(MainActivity.this, R.anim.trans);
                a_trans.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_trans);
            }
        });

        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                a_alpha.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_alpha);
            }
        });


    }

    Animation.AnimationListener animationOutListener
            = new Animation.AnimationListener() {


        @Override
        public void onAnimationStart(Animation animation) {
            //Snackbar.make(coordinatorLayout, "Start Animation", Snackbar.LENGTH_LONG).show();

            if(animation == a_alpha){
                Snackbar.make(coordinatorLayout, "Start Alpha Animation", Snackbar.LENGTH_LONG).show();

            }

             if(animation == a_rotate){
                Snackbar.make(coordinatorLayout, "Start Rotate Animation", Snackbar.LENGTH_LONG).show();

            }

             if(animation == a_scale){
                Snackbar.make(coordinatorLayout, "Start Scale Animation", Snackbar.LENGTH_LONG).show();

            }

             if(animation == a_trans){
                Snackbar.make(coordinatorLayout, "Start Translate Animation", Snackbar.LENGTH_LONG).show();

            }


        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Snackbar.make(coordinatorLayout, "End Of Animation", Snackbar.LENGTH_LONG).show();

        }

        @Override
        public void onAnimationRepeat(Animation animation) {
            Snackbar.make(coordinatorLayout, "Repeate Animation", Snackbar.LENGTH_LONG).show();

        }
    };*/
}
