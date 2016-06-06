package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScoringResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_result);
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, PassTeam2Activity.class);
        startActivity(intent);
    }

    public void goQuit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
        //TODO This probably needs to be rewritten so that it kills all activites in the Task manager
    }
}
