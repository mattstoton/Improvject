package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScoringActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring);
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, ScoringResultActivity.class);
        startActivity(intent);
    }

    public void goQuit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
        //TODO This probably needs to be rewritten so that it kills all activites in the Task manager
    }
}
