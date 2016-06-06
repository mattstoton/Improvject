package com.rando.mstoton.improvject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import junit.framework.Assert;

import java.util.*;

//TODO Tie all the views together
//TODO Loading/storage for all the activities/locations/etc
//TODO Create a robust random number generator
//TODO Set up the scoring page
//TODO Create timer for game play
//TODO Figure out Dialog displays

public class MainActivity extends Activity implements View.OnClickListener {
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

    @Override
    public void onClick(View view) {

        System.out.println("onclick listener fire SUCCESS");
        //if this doesnt work Ill try and set teamnamesactivity's listener when I present it

    }

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

        In hindsight, I think it likely that I will refactor everything to use activites,
        probably after I have a working version. Hence why all the activity classes are still here.

        At some point I will also condense the views. We have way too many.

         */
        //setContentView(R.layout.activity_team_names);
        //viewStack.push(R.layout.activity_team_names);
        Intent newGame = new Intent(this, TeamNamesActivity.class);
        startActivity(newGame);
    }
    //I Might refactor all the layout names later. This might not end well.
/*  until I have a better idea I will just have a separate method to handle every continue button
    it'll be a bit messy. ideally need a solution. basically will need a method to open every view
    OR route every button to one method which will send to different views based on ref ID
 */

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

    /*public void openView(View view) {
        int viewId = view.getId();
        if (viewParent.getId() == R.layout.activity_team_names) {
            System.out.println("parent is team names SUCCESS");
        }
        if (view.getId() == R.id.teamNamesContinue) {
            System.out.println("button name is teamNamesContinue SUCCESS");
        }
        System.out.println("Nothing else printed FAIL");
        switch (viewId) {
            case R.id.teamNamesContinue:
                setContentView(R.layout.activity_game_setup);
                break;
            case R.id.secretObjectContinue:
            case R.id.scoringResultContinue:
            case R.id.scoringContinue:
            case R.id.passTeam1Continue:
            case R.id.passTeam2Continue:
            case R.id.mixUpContinue:
            case R.id.gameplayContinue:
            case R.id.gamesetupContinue:
        }


    }*/
/*
    public void openGameSetup(View view) {

    }

    public void openGameSetup(View view) {

    }

    public void openGameSetup(View view) {

    }

    public void openGameSetup(View view) {

    }

    public void openGameSetup(View view) {

    }*/

    //Randomization

}
