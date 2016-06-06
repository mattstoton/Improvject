package com.rando.mstoton.improvject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeamNamesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_names);
        Button myButton = (Button)findViewById(R.id.teamNamesContinue);
        //myButton.setOnClickListener(findViewById(R.layout.activity_main));
    }

    public void goBack(View view) {
        finish();
    }

    public void goForward(View view) {
        Intent intent = new Intent(this, PassTeam1Activity.class);
        startActivity(intent);
    }
}
