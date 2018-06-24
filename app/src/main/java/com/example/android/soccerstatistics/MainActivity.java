package com.example.android.soccerstatistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int attemptsTeamA = 0;
    int attemptsTeamB = 0;
    int onTargetTeamA = 0;
    int onTargetTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        attemptsTeamA = 0;
        attemptsTeamB = 0;
        onTargetTeamA = 0;
        onTargetTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        scoreDisplayForTeamA(scoreTeamA);
        scoreDisplayForTeamB(scoreTeamB);
        attemptsDisplayForTeamA(attemptsTeamA);
        attemptsDisplayForTeamB(attemptsTeamB);
        onTargetDisplayForTeamA(onTargetTeamA);
        onTargetDisplayForTeamB(onTargetTeamB);
        yellowCardDisplayForTeamA(yellowCardTeamA);
        yellowCardDisplayForTeamB(yellowCardTeamB);
        redCardDisplayForTeamA(redCardTeamA);
        redCardDisplayForTeamB(redCardTeamB);
    }
    public void goalA(View view){
        scoreTeamA = scoreTeamA + 1;
        scoreDisplayForTeamA(scoreTeamA);
    }
    public void attemptsA(View view){
        attemptsTeamA = attemptsTeamA +1;
        attemptsDisplayForTeamA(attemptsTeamA);
    }
    public void targetA(View view){
        onTargetTeamA = onTargetTeamA + 1;
        onTargetDisplayForTeamA(onTargetTeamA);
    }
    public void yellowA(View view){
        yellowCardTeamA = yellowCardTeamA + 1;
        yellowCardDisplayForTeamA(yellowCardTeamA);
    }
    public void redA(View view){
        redCardTeamA = redCardTeamA + 1;
        redCardDisplayForTeamA(redCardTeamA);
    }
    public void goalB(View view){
        scoreTeamB = scoreTeamB + 1;
        scoreDisplayForTeamB(scoreTeamB);
    }
    public void attemptsB(View view){
        attemptsTeamB = attemptsTeamB +1;
        attemptsDisplayForTeamB(attemptsTeamB);
    }
    public void targetB(View view){
        onTargetTeamB = onTargetTeamB + 1;
        onTargetDisplayForTeamB(onTargetTeamB);
    }
    public void yellowB(View view){
        yellowCardTeamB = yellowCardTeamB + 1;
        yellowCardDisplayForTeamB(yellowCardTeamB);
    }
    public void redB(View view){
        redCardTeamB = redCardTeamB + 1;
        redCardDisplayForTeamB(redCardTeamB);
    }


    private void scoreDisplayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    private void attemptsDisplayForTeamA(int attempts) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_attempts);
        scoreView.setText(String.valueOf(attempts));
    }
    private void onTargetDisplayForTeamA(int ontarget) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_on_target);
        scoreView.setText(String.valueOf(ontarget));
    }

    private void yellowCardDisplayForTeamA(int yellowcard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(yellowcard));
    }
    private void redCardDisplayForTeamA(int redcard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(redcard));
    }
    private void scoreDisplayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    private void attemptsDisplayForTeamB(int attempts) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_attempts);
        scoreView.setText(String.valueOf(attempts));
    }
    private void onTargetDisplayForTeamB(int ontarget) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_on_target);
        scoreView.setText(String.valueOf(ontarget));
    }
    private void yellowCardDisplayForTeamB(int yellowcard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(yellowcard));
    }
    private void redCardDisplayForTeamB(int redcard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(redcard));
    }

}

