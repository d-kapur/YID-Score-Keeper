package com.kapur.yidscorekeeper

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    //Team1
    fun team1FirstUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 1000;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team1SecondUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 500;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team1ThirdUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 250;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team1FourthUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 125;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team1BonusUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 50;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team1ResetUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        teamScoreBox.setText("0")
    }

    //Team2

    fun team2FirstUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 1000;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team2SecondUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 500;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team2ThirdUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 250;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team2FourthUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 125;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team2BonusUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 50;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team2ResetUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team2Score)
        teamScoreBox.setText("0")
    }

    //Team3

    fun team3FirstUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 1000;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team3SecondUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 500;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team3ThirdUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 250;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team3FourthUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 125;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team3BonusUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 50;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team3ResetUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team3Score)
        teamScoreBox.setText("0")
    }

    //Team4

    fun team4FirstUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 1000;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team4SecondUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 500;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team4ThirdUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 250;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team4FourthUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 125;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team4BonusUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 50;

        teamScoreBox.setText(teamScoreVal.toString())
    }

    fun team4ResetUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team4Score)
        teamScoreBox.setText("0")
    }
}
