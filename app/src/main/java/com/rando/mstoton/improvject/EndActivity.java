package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EndActivity extends Activity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }
}
