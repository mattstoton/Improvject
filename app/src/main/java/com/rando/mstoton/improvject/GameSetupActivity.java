package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameSetupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_setup);
    }

    public void goBack(View view) {
        finish();
    }

    public void goQuit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
        //TODO This probably needs to be rewritten
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }

    public void reload(View view) {

    }

    public void mixUp(View view) {

    }
}
