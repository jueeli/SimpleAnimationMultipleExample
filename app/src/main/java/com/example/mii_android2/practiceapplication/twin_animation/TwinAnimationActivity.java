package com.example.mii_android2.practiceapplication.twin_animation;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mii_android2.practiceapplication.R;

public class TwinAnimationActivity extends AppCompatActivity {

    Button btn_rotate, btn_scale, btn_trans, btn_alpha;
    ImageView img_ball;
    Animation a_rotate, a_scale, a_trans, a_alpha;
    CoordinatorLayout coordinatorLayout;
    Animation.AnimationListener animationOutListener
            = new Animation.AnimationListener() {


        @Override
        public void onAnimationStart(Animation animation) {
            //Snackbar.make(coordinatorLayout, "Start Animation", Snackbar.LENGTH_LONG).show();

            if (animation == a_alpha) {
                Snackbar.make(coordinatorLayout, "Start Alpha Animation", Snackbar.LENGTH_LONG).show();

            }

            if (animation == a_rotate) {
                Snackbar.make(coordinatorLayout, "Start Rotate Animation", Snackbar.LENGTH_LONG).show();

            }

            if (animation == a_scale) {
                Snackbar.make(coordinatorLayout, "Start Scale Animation", Snackbar.LENGTH_LONG).show();

            }

            if (animation == a_trans) {
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
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twin_layout);

        btn_rotate = (Button) findViewById(R.id.btn_rotate);
        btn_scale = (Button) findViewById(R.id.btn_scale);
        btn_trans = (Button) findViewById(R.id.btn_translate);
        btn_alpha = (Button) findViewById(R.id.btn_alpha);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        img_ball = (ImageView) findViewById(R.id.img_ball);

        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_trans = new TranslateAnimation(
                        Animation.ABSOLUTE, 0.0f,
                        Animation.ABSOLUTE, 150f,
                        Animation.ABSOLUTE, 0.0f,
                        Animation.ABSOLUTE, 0.0f

                );

                a_trans.setDuration(1000);
                a_trans.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_trans);
            }
        });

        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_scale = new ScaleAnimation(
                        1.0f, 1.5f,
                        1.0f, 1.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f
                );
                a_scale.setDuration(1000);
                a_scale.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_scale);
            }
        });


        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a_rotate = new RotateAnimation(

                        0.0f, -180f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f
                );

                a_rotate.setDuration(1000);
                a_rotate.setRepeatMode(Animation.REVERSE);
                a_rotate.setRepeatCount(4);
                a_rotate.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_rotate);
            }
        });

        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_alpha = new AlphaAnimation(1.0f, 0.0f);
                a_alpha.setDuration(2000);
                a_alpha.setAnimationListener(animationOutListener);
                img_ball.startAnimation(a_alpha);
            }
        });


    }
}
