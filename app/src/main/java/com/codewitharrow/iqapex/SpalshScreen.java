package com.codewitharrow.iqapex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class SpalshScreen extends AppCompatActivity {

    ImageView abstract_, logo;
    CardView login_btn, signUp;
    private int animDuration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        abstract_ = findViewById(R.id.login_abs);
        logo = findViewById(R.id.logo);
        login_btn = findViewById(R.id.login_button);
        signUp = findViewById(R.id.sign_up_btn);

        animate();
    }

    void animate(){
      Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
      Animation fadein_slow = AnimationUtils.loadAnimation(this,R.anim.fadein_slow);
      abstract_.startAnimation(fadeIn);
      logo.startAnimation(fadein_slow);
      login_btn.startAnimation(fadein_slow);
      signUp.startAnimation(fadein_slow);
    }
}