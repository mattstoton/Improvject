package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PassTeam1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_team1);
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, SecretObjectActivity.class);
        startActivity(intent);
    }
}
