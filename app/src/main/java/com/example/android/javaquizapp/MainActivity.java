package com.example.android.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton mRadioButtonInt, mRadioButtonDouble, mRadioButtonFloat, mRadioButtonVoid;
    RadioButton mRBInheritance, mRBEncapsulation, mRBPolymorphism, mRBCompilation;
    CheckBox mCBTrue, mCBFalse;
    RadioButton mRBOptionOne, mRBOptionTwo, mRBOptionThree, mRBOptionFour;
    RadioButton mRBMainMethod, mRBFinalizeMethod, mRBPrivateMethod, mRBStaticMethod;
    TextView mTVQuestionSix;
    EditText trueEditText;
    CheckBox mCBInteger, mCBBoolean, mCBChar;
    private String mAnswerOne, mAnswerTwo, mAnswerFour, mAnswerFive, mAnswerSix;
    private String correctAnswerOne = "void";
    private String correctAnswerTwo = "Compilation";
    private String correctAnswerFour = "Box obj = new Box();";
    private String correctAnswerFive = "main method";
    private String correctAnswerSix = "True";

    private int score = 0;
    private int scoreQ1 = 0;
    private int scoreQ2 = 0;
    private int scoreQ3 = 0;
    private int scoreQ4 = 0;
    private int scoreQ5 = 0;
    private int scoreQ6 = 0;
    private int scoreQ7 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mRadioButtonInt = findViewById(R.id.question_one_int);
        mRadioButtonFloat = findViewById(R.id.question_one_float);
        mRadioButtonDouble = findViewById(R.id.question_one_double);
        mRadioButtonVoid = findViewById(R.id.question_one_void);
        mRBInheritance = findViewById(R.id.question_two_inheritance);
        mRBEncapsulation = findViewById(R.id.question_two_encapsulation);
        mRBPolymorphism = findViewById(R.id.question_two_polymorphism);
        mRBCompilation = findViewById(R.id.question_two_compiltion);
        mCBTrue = findViewById(R.id.question_three_true);
        mCBFalse = findViewById(R.id.question_three_false);
        mRBOptionOne = findViewById(R.id.radio_optipn_one);
        mRBOptionTwo = findViewById(R.id.radio_option_two);
        mRBOptionThree = findViewById(R.id.radio_option_three);
        mRBOptionFour = findViewById(R.id.radio_option_four);
        mRBMainMethod = findViewById(R.id.question_five_main);
        mRBFinalizeMethod = findViewById(R.id.question_five_finalize);
        mRBPrivateMethod = findViewById(R.id.question_five_private);
        mRBStaticMethod = findViewById(R.id.question_five_static);
        trueEditText = findViewById(R.id.question_six_edit_text);
        mTVQuestionSix = findViewById(R.id.question_six_edit_text);
        mCBInteger = findViewById(R.id.integer);
        mCBBoolean = findViewById(R.id.boolean_check_box);
        mCBChar = findViewById(R.id.char_check_box);
    }

    public void questionOneRadioButton(View view) {
        switch (view.getId()) {
            case R.id.question_one_int:
                if (mRadioButtonInt.isChecked() || mRadioButtonFloat.isChecked() || mRadioButtonVoid.isChecked() || mRadioButtonDouble.isChecked()) {
                    mAnswerOne = mRadioButtonInt.getText().toString();
                }
                break;
            case R.id.question_one_float:
                if (mRadioButtonInt.isChecked() || mRadioButtonFloat.isChecked() || mRadioButtonVoid.isChecked() || mRadioButtonDouble.isChecked()) {
                    mAnswerOne = mRadioButtonFloat.getText().toString();
                }
                break;
            case R.id.question_one_void:
                if (mRadioButtonInt.isChecked() || mRadioButtonFloat.isChecked() || mRadioButtonVoid.isChecked() || mRadioButtonDouble.isChecked()) {
                    mAnswerOne = mRadioButtonVoid.getText().toString();
                }
                break;

            case R.id.question_one_double:
                if (mRadioButtonInt.isChecked() || mRadioButtonFloat.isChecked() || mRadioButtonVoid.isChecked() || mRadioButtonDouble.isChecked()) {
                    mAnswerOne = mRadioButtonDouble.getText().toString();
                }
                break;
        }
    }

    public void questionTwoRadioButton(View view) {

        switch (view.getId()) {
            case R.id.question_two_inheritance:
                if (mRBInheritance.isChecked() || mRBEncapsulation.isChecked() || mRBPolymorphism.isChecked() || mRBCompilation.isChecked()) {
                    mAnswerTwo = mRBInheritance.getText().toString();
                }
                break;
            case R.id.question_two_encapsulation:
                if (mRBInheritance.isChecked() || mRBEncapsulation.isChecked() || mRBPolymorphism.isChecked() || mRBCompilation.isChecked()) {
                    mAnswerTwo = mRBEncapsulation.getText().toString();
                }
                break;
            case R.id.question_two_polymorphism:
                if (mRBInheritance.isChecked() || mRBEncapsulation.isChecked() || mRBPolymorphism.isChecked() || mRBCompilation.isChecked()) {
                    mAnswerTwo = mRBPolymorphism.getText().toString();
                }
                break;
            case R.id.question_two_compiltion:
                if (mRBInheritance.isChecked() || mRBEncapsulation.isChecked() || mRBPolymorphism.isChecked() || mRBCompilation.isChecked()) {
                    mAnswerTwo = mRBCompilation.getText().toString();

                }
                break;
        }
    }
    public void questionFourRadioButton(View view) {
        switch (view.getId()) {
            case R.id.radio_optipn_one:
                if (mRBOptionOne.isChecked() || mRBOptionTwo.isChecked() || mRBOptionThree.isChecked() || mRBOptionFour.isChecked()) {
                    mAnswerFour = mRBOptionOne.getText().toString();
                }
                break;
            case R.id.radio_option_two:
                if (mRBOptionOne.isChecked() || mRBOptionTwo.isChecked() || mRBOptionThree.isChecked() || mRBOptionFour.isChecked()) {
                    mAnswerFour = mRBOptionTwo.getText().toString();
                }
                break;
            case R.id.radio_option_three:
                if (mRBOptionOne.isChecked() || mRBOptionTwo.isChecked() || mRBOptionThree.isChecked() || mRBOptionFour.isChecked()) {
                    mAnswerFour = mRBOptionThree.getText().toString();
                }
                break;
            case R.id.radio_option_four:
                if (mRBOptionOne.isChecked() || mRBOptionTwo.isChecked() || mRBOptionThree.isChecked() || mRBOptionFour.isChecked()) {
                    mAnswerFour = mRBOptionFour.getText().toString();
                }
                break;
        }
    }

    public void questionFiveRadioButton(View view) {
        switch (view.getId()) {
            case R.id.question_five_main:
                if (mRBMainMethod.isChecked() || mRBFinalizeMethod.isChecked() || mRBPrivateMethod.isChecked() || mRBStaticMethod.isChecked()) {
                    mAnswerFive = mRBMainMethod.getText().toString();
                }
                break;
            case R.id.question_five_finalize:
                if (mRBMainMethod.isChecked() || mRBFinalizeMethod.isChecked() || mRBPrivateMethod.isChecked() || mRBStaticMethod.isChecked()) {
                    mAnswerFive = mRBFinalizeMethod.getText().toString();
                }
                break;
            case R.id.question_five_private:
                if (mRBMainMethod.isChecked() || mRBFinalizeMethod.isChecked() || mRBPrivateMethod.isChecked() || mRBStaticMethod.isChecked()) {
                    mAnswerFive = mRBPrivateMethod.getText().toString();
                }
                break;
            case R.id.question_five_static:
                if (mRBMainMethod.isChecked() || mRBFinalizeMethod.isChecked() || mRBPrivateMethod.isChecked() || mRBStaticMethod.isChecked()) {
                    mAnswerFive = mRBStaticMethod.getText().toString();
                }
                break;
        }
    }

    public void submitAnswer(View view) {
        if (mAnswerOne != null && mAnswerOne.equalsIgnoreCase(correctAnswerOne)) {
            scoreQ1 = 1;
        } else {
            scoreQ1 = 0;
        }
        if (mAnswerTwo != null && mAnswerTwo.equalsIgnoreCase(correctAnswerTwo)) {
            scoreQ2 = 1;
        } else {
            scoreQ2 = 0;
        }
        if (mCBTrue.isChecked() && !mCBFalse.isChecked()) {
            scoreQ3 = 1;
        } else {
            scoreQ3 = 0;
        }
        if (mAnswerFour != null && mAnswerFour.equals(correctAnswerFour)) {
            scoreQ4 = 1;
        } else {
            scoreQ4 = 0;
        }
        if (mAnswerFive != null && mAnswerFive.equalsIgnoreCase(correctAnswerFive)) {
            scoreQ5 = 1;
        } else {
            scoreQ5 = 0;
        }
        if (!TextUtils.isEmpty(mAnswerSix = trueEditText.getText().toString())) {
            if (mAnswerSix.equalsIgnoreCase(correctAnswerSix)) {
                scoreQ6 = 1;
            } else {
                scoreQ6 = 0;
            }
        }
        if (mCBInteger.isChecked() && mCBBoolean.isChecked() && mCBChar.isChecked()) {
            scoreQ7 = 1;
        } else {
            scoreQ7 = 0;
        }
        score = scoreQ1 + scoreQ2 + scoreQ3 + scoreQ4 + scoreQ5 + scoreQ6 + scoreQ7;
        Toast.makeText(MainActivity.this, score + " is correct out of 7 question ", Toast.LENGTH_SHORT).show();

    }

}
