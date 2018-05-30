package iktaniyalol.ru.technicalassistant.interfaces;

import java.util.Random;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SchitGame extends Test implements OnClickListener {

    private int level = 0, answer = 0, operator = 4, number1 = 0,
            number2 = 0, number3 = 0, popyt = 0, time;
    private String[] operators = {"+", "-"};
    private String[] operatorshard = {"+", "-", "*", "/"};

    private Random random;

    private TextView question, answerTxt, scoreTxt, popytky, timer;
    private Button one, two, three, four, five, six, seven, eight, nine, zero,
            enter, cancel, minus;
    private CountDownTimer timercount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schitgame);
        question = (TextView) findViewById(R.id.question);
        answerTxt = (TextView) findViewById(R.id.answer);
        scoreTxt = (TextView) findViewById(R.id.score);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        minus = (Button) findViewById(R.id.minus);
        enter = (Button) findViewById(R.id.enter);
        cancel = (Button) findViewById(R.id.cancel);
        popytky = (TextView) findViewById(R.id.popyt);
        timer = (TextView) findViewById(R.id.timer);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        minus.setOnClickListener(this);
        enter.setOnClickListener(this);
        cancel.setOnClickListener(this);

        if (Test.level >= 0) {
            level = Test.level;
        }
        random = new Random();
        switch (level) {
            case 0:
                popyt = 3;
                popytky.setText("Попытки: " + popyt);
                time = 60000;
                break;
            case 1:
                popyt = 2;
                popytky.setText("Попытки: " + popyt);
                time = 30000;
                break;
            case 2:
                popyt = 1;
                popytky.setText("Попытки: " + popyt);
                time = 15000;
                break;
        }
        Question(level);


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.enter) {
            String answerContent = answerTxt.getText().toString();
            if (!answerContent.equals("") && !answerContent.equals("?") && !answerContent.equals("-")) {
                int enteredAnswer = Integer.parseInt(answerContent);
                int exScore = getScore();
                if (enteredAnswer == answer) {
                    scoreTxt.setText("Счет: " + (exScore + 1));
                } else {
                    popyt = popyt - 1;
                    popytky.setText("Попытки: " + popyt);
                    scoreTxt.setText("Счет: 0");
                    if (popyt == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Вы проиграли! Ваш счет: " + exScore, Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                        if (!(timercount == null)) {
                            timercount.cancel();
                        }
                        this.finish();
                    }
                }
                Question(level);
            }
        } else if (view.getId() == R.id.cancel) {
            answerTxt.setText("?");
        } else if (view.getId() == R.id.minus) {
            if (answerTxt.getText().toString().equals("?")) {
                answerTxt.setText("-");
            } else {
                if (!(answerTxt.getText().toString().charAt(0) == '-') && !(answerTxt.getText().toString().equals("0"))) {
                    answerTxt.setText("-" + answerTxt.getText().toString());
                }

            }

        } else {
            int enteredNum = Integer.parseInt(view.getTag().toString());
            if (view.getId() == R.id.zero && answerTxt.getText().toString().equals("-")) {
                answerTxt.setText("" + enteredNum);
            }
            if (answerTxt.getText().toString().equals("?")) {
                answerTxt.setText("" + enteredNum);
            } else if (answerTxt.getText().toString().equals("0")) {
                answerTxt.setText("" + enteredNum);
            } else {
                if (answerTxt.getText().toString().charAt(0) == '-' && (answerTxt.getText().toString().length() < 5)) {
                    answerTxt.setText(answerTxt.getText().toString() + enteredNum);
                } else if (answerTxt.getText().toString().length() < 4) {
                    answerTxt.setText(answerTxt.getText().toString() + enteredNum);
                }
            }
        }
    }

    private void Question(int level) {
        if (!(timercount == null)) {
            timercount.cancel();
        }
        timer(time);
        answerTxt.setText("?");
        switch (level) {
            case 0:
                operator = random.nextInt(operators.length);
                number1 = getNumber(level, operator);
                number2 = getNumber(level, operator);
                switch (operator) {
                    case 0:
                        answer = number1 + number2;
                        break;
                    case 1:
                        answer = number1 - number2;
                        break;
                    default:
                        break;
                }
                if (number2 >= 0) {
                    question.setText(number1 + " " + operators[operator] + " " + number2 + " =");
                } else {
                    question.setText(number1 + " " + operators[operator] + " (" + number2 + ") =");
                }
                break;
            case 1:
                operator = random.nextInt(operators.length);
                number1 = getNumber(level, operator);
                number2 = getNumber(level, operator);
                switch (operator) {
                    case 0:
                        answer = number1 + number2;
                        break;
                    case 1:
                        answer = number1 - number2;
                        break;
                    default:
                        break;
                }
                if (number2 >= 0) {
                    question.setText(number1 + " " + operators[operator] + " " + number2 + " =");
                } else {
                    question.setText(number1 + " " + operators[operator] + " (" + number2 + ") =");
                }

                break;
            case 2:
                operator = random.nextInt(operatorshard.length);
                number1 = getNumber(level, operator);
                number2 = getNumber(level, operator);
                if (operator == 3) {
                    while (!((number1 % number2) == 0) || (number1 == number2)) {
                        number1 = getNumber(level, operator);
                        number2 = getNumber(level, operator);
                    }
                }
                switch (operator) {
                    case 0:
                        answer = number1 + number2;
                        break;
                    case 1:
                        answer = number1 - number2;
                        break;
                    case 2:
                        answer = number1 * number2;
                        break;
                    case 3:
                        answer = number1 / number2;
                        break;
                    default:
                        break;
                }
                if (number2 >= 0) {
                    question.setText(number1 + " " + operatorshard[operator] + " " + number2 + " =");
                } else {
                    question.setText(number1 + " " + operatorshard[operator] + " (" + number2 + ") =");
                }
        }
    }

    private void timer(int time) {
        timercount = new CountDownTimer(time, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Время: " + (int) millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                timer.setText("Время вышло!");
                popyt = popyt - 1;
                popytky.setText("Попытки: " + popyt);
                if (!(popyt == 0)) {
                    Question(level);
                } else {
                    finished();
                }
            }
        };
        timercount.start();
    }

    public void onBackPressed() {
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                SchitGame.this);
        quitDialog.setTitle("Вы уверены что хотите выйти?\nВаш счет не сохранится.");

        quitDialog.setPositiveButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                timercount.cancel();
                finish();
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        quitDialog.show();
    }

    private void finished() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Вы проиграли! Ваш счет: " + getScore(), Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        timercount.cancel();
        this.finish();

    }

    private int getNumber(int level, int operator) {
        int number = 0;
        boolean b = random.nextBoolean();
        switch (level) {
            case 0:
                if (b) {
                    number = random.nextInt(50);
                } else {
                    number = random.nextInt(50) * (-1);
                }
                break;
            case 1:
                if (b) {
                    number = random.nextInt(200);
                } else {
                    number = random.nextInt(200) * (-1);
                }
                break;
            case 2:
                if (operator == 0 || operator == 1) {
                    if (b) {
                        number = random.nextInt(500);
                    } else {
                        number = random.nextInt(500) * (-1);
                    }
                } else {
                    if (b) {
                        number = random.nextInt(99);
                    } else {
                        number = random.nextInt(99) * (-1);
                    }
                }
                break;
        }
        return number;
    }

    private int getScore() {
        String scoreStr = scoreTxt.getText().toString();
        return Integer.parseInt(scoreStr.substring(scoreStr.lastIndexOf(" ") + 1));
    }
}
