package com.rando.mstoton.improvject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.*;

//TODO Tie all the views together
//TODO Create a robust random number generator
//TODO Set up the scoring page

public class MainActivity extends Activity {
    //Class variables
    private static String TeamName1 = "Team 1"; //I don't remember if this is a good idea or not
    private static String TeamName2 = "Team 2"; //yolo
    private static Stack viewStack = new Stack();

    //Overrides
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
    // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    // Remember that you should never show the action bar if the
    // status bar is hidden, so hide that too if necessary.
        //ActionBar actionBar = getActionBar();
        //actionBar.hide();
    }

    /*@Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        final View decorView = getWindow().getDecorView();
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }*/

    //I'll clean this up later, refactor it into one method later

    //Main Screen Button methods
    public void newGame(View v) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //so Im thinking I can actuallty just fuck around with setcontentview and avoid activities which
        // would be super nice?
        //just need to set the context in each layout to be mainactivity
        /*
        Thinking of doing a stack of views for all the different layouts
        I will likely need/want to refactor a lot of things into separate classes
        to keep things neat. This is a game though so I think its okay for its design to be more
        centralized and not split among the views or I'll be passing data back and forth between views.

        At some point I will also condense the views. We have way too many.

         */
        setContentView(R.layout.activity_team_names);
        viewStack.push(R.layout.activity_team_names);
    }
    //I Might refactor all the layout names later. This might not end well.
    public void openPrefs(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
    }

    public void openRules(View view) {
        setContentView(R.layout.activity_rules);
    }

    public void openTips(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
    }

    public void openSettings(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
    }

    public void openExtras(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
    }

    public void openPractice(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
    }

    //Randomization

}
