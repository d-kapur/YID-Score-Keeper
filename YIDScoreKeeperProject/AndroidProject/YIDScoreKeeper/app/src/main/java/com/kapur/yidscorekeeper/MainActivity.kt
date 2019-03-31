package com.kapur.yidscorekeeper

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    //File Handling

    val TEAM1NAME = "t1n.txt"
    val TEAM2NAME = "t2n.txt"
    val TEAM3NAME = "t3n.txt"
    val TEAM4NAME = "t4n.txt"

    val TEAM1SCORE = "t1s.txt"
    val TEAM2SCORE = "t2s.txt"
    val TEAM3SCORE = "t3s.txt"
    val TEAM4SCORE = "t4s.txt"


    fun save(view: View) {
        var team1NameString: String = team1Name.text.toString()
        var team2NameString: String = team2Name.text.toString()
        var team3NameString: String = team3Name.text.toString()
        var team4NameString: String = team4Name.text.toString()

        var team1ScoreString: String = team1Score.text.toString()
        var team2ScoreString: String = team2Score.text.toString()
        var team3ScoreString: String = team3Score.text.toString()
        var team4ScoreString: String = team4Score.text.toString()

        var fos1: FileOutputStream? = null
        var fos2: FileOutputStream? = null
        var fos3: FileOutputStream? = null
        var fos4: FileOutputStream? = null
        var fos5: FileOutputStream? = null
        var fos6: FileOutputStream? = null
        var fos7: FileOutputStream? = null
        var fos8: FileOutputStream? = null

        fos1 = openFileOutput(TEAM1NAME, MODE_PRIVATE)
        fos2 = openFileOutput(TEAM2NAME, MODE_PRIVATE)
        fos3 = openFileOutput(TEAM3NAME, MODE_PRIVATE)
        fos4 = openFileOutput(TEAM4NAME, MODE_PRIVATE)
        fos5 = openFileOutput(TEAM1SCORE, MODE_PRIVATE)
        fos6 = openFileOutput(TEAM2SCORE, MODE_PRIVATE)
        fos7 = openFileOutput(TEAM3SCORE, MODE_PRIVATE)
        fos8 = openFileOutput(TEAM4SCORE, MODE_PRIVATE)

        fos1.write(team1NameString.toByteArray())
        fos2.write(team2NameString.toByteArray())
        fos3.write(team3NameString.toByteArray())
        fos4.write(team4NameString.toByteArray())
        fos5.write(team1ScoreString.toByteArray())
        fos6.write(team2ScoreString.toByteArray())
        fos7.write(team3ScoreString.toByteArray())
        fos8.write(team4ScoreString.toByteArray())

        Toast.makeText(this, "The Above Teams and Scores have been Saved!", Toast.LENGTH_LONG).show()

        if (fos1 != null) {
            fos1.close();
        }

        if (fos2 != null) {
            fos2.close();
        }

        if (fos3 != null) {
            fos3.close();
        }

        if (fos4 != null) {
            fos4.close();
        }

        if (fos5 != null) {
            fos5.close();
        }

        if (fos6 != null) {
            fos6.close();
        }

        if (fos7 != null) {
            fos7.close();
        }

        if (fos8 != null) {
            fos8.close();
        }


    }

    fun load(view: View) {
        var fis1: FileInputStream? = null;
        var fis2: FileInputStream? = null;
        var fis3: FileInputStream? = null;
        var fis4: FileInputStream? = null;
        var fis5: FileInputStream? = null;
        var fis6: FileInputStream? = null;
        var fis7: FileInputStream? = null;
        var fis8: FileInputStream? = null;

        fis1 = openFileInput(TEAM1NAME)
        fis2 = openFileInput(TEAM2NAME)
        fis3 = openFileInput(TEAM3NAME)
        fis4 = openFileInput(TEAM4NAME)
        fis5 = openFileInput(TEAM1SCORE)
        fis6 = openFileInput(TEAM2SCORE)
        fis7 = openFileInput(TEAM3SCORE)
        fis8 = openFileInput(TEAM4SCORE)

        val isr1 = InputStreamReader(fis1)
        val isr2 = InputStreamReader(fis2)
        val isr3 = InputStreamReader(fis3)
        val isr4 = InputStreamReader(fis4)
        val isr5 = InputStreamReader(fis5)
        val isr6 = InputStreamReader(fis6)
        val isr7 = InputStreamReader(fis7)
        val isr8 = InputStreamReader(fis8)

        val br1 = BufferedReader(isr1)
        val br2 = BufferedReader(isr2)
        val br3 = BufferedReader(isr3)
        val br4 = BufferedReader(isr4)
        val br5 = BufferedReader(isr5)
        val br6 = BufferedReader(isr6)
        val br7 = BufferedReader(isr7)
        val br8 = BufferedReader(isr8)

        val sb1 = StringBuilder()
        val sb2 = StringBuilder()
        val sb3 = StringBuilder()
        val sb4 = StringBuilder()
        val sb5 = StringBuilder()
        val sb6 = StringBuilder()
        val sb7 = StringBuilder()
        val sb8 = StringBuilder()

        var team1NameString: String
        var team2NameString: String
        var team3NameString: String
        var team4NameString: String

        var team1ScoreString: String
        var team2ScoreString: String
        var team3ScoreString: String
        var team4ScoreString: String

        team1NameString = br1.readText()
        team2NameString = br2.readText()
        team3NameString = br3.readText()
        team4NameString = br4.readText()
        team1ScoreString = br5.readText()
        team2ScoreString = br6.readText()
        team3ScoreString = br7.readText()
        team4ScoreString = br8.readText()

        sb1.append(team1NameString)
        sb2.append(team2NameString)
        sb3.append(team3NameString)
        sb4.append(team4NameString)
        sb5.append(team1ScoreString)
        sb6.append(team2ScoreString)
        sb7.append(team3ScoreString)
        sb8.append(team4ScoreString)

        team1Name.setText(sb1.toString())
        team2Name.setText(sb2.toString())
        team3Name.setText(sb3.toString())
        team4Name.setText(sb4.toString())
        team1Score.setText(sb5.toString())
        team2Score.setText(sb6.toString())
        team3Score.setText(sb7.toString())
        team4Score.setText(sb8.toString())

        if (fis1 != null) {
            fis1.close();
        }
        if (fis2 != null) {
            fis2.close();
        }
        if (fis3 != null) {
            fis3.close();
        }
        if (fis4 != null) {
            fis4.close();
        }
        if (fis5 != null) {
            fis5.close();
        }
        if (fis6 != null) {
            fis6.close();
        }
        if (fis7 != null) {
            fis7.close();
        }
        if (fis8 != null) {
            fis8.close();
        }

    }


    //Team1
    fun team1FirstUpdate(view: View)
    {
        val teamScoreBox = findViewById<EditText>(R.id.team1Score)
        val teamScoreString = teamScoreBox.text.toString()
        var teamScoreVal : Int = Integer.parseInt(teamScoreString)
        teamScoreVal += 1000

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
