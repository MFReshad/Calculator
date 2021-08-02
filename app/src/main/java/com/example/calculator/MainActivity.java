package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    TextView screen,screen2,icon;
    Button button1,button2,button3,button4,button5; // 1,2,3,4,5
    Button button6,button7,button8,button9,button0; // 6,7,8,9,0
    Button buttonPoint,buttonEq,buttonRt,buttonBr2; // '.' point , '=' calculation , '√' root , '≈' round
    Button buttonSum,buttonSub,buttonMul,buttonDiv,buttonMod; // + , - , * , / , %
    Button buttonSin,buttonCos,buttonTan,buttonAC,buttonC;

    int t=0,m=0; //t is for operators & m is for max rang of screen size alert editable non editable
    int x=0,y=0; //x & y is for '.' x for screen 1 & y for screen 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Calculator created by 'MFReshad'", Toast.LENGTH_LONG).show();

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonAC = findViewById(R.id.buttonAC);
        buttonC = findViewById(R.id.buttonC);
        buttonEq = findViewById(R.id.buttonEq);
        buttonSum = findViewById(R.id.buttonSum);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMod = findViewById(R.id.buttonMod);
        buttonRt = findViewById(R.id.buttonRt);
        buttonBr2 = findViewById(R.id.buttonBr2);
        buttonSin = findViewById(R.id.buttonSin);
        buttonCos = findViewById(R.id.buttonCos);
        buttonTan = findViewById(R.id.buttonTan);
        screen = findViewById(R.id.screen);
        screen2 = findViewById(R.id.screen2);
        icon = findViewById(R.id.icon);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if (icon.getText() == "")
                        {
                            if(screen.getText() != "")
                                screen.setText(screen.getText() + "0");
                        }
                        else
                            screen2.setText(screen2.getText() + "0");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "0");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "0" + ")");
                        }
                    }
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "1");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "1");
                        } else
                            screen2.setText(screen2.getText() + "1");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "1");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "1" + ")");
                        }
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "2");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "2");
                        } else
                            screen2.setText(screen2.getText() + "2");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "2");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "2" + ")");
                        }
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "3");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "3");
                        } else
                            screen2.setText(screen2.getText() + "3");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "3");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "3" + ")");
                        }
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "4");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "4");
                        } else
                            screen2.setText(screen2.getText() + "4");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "4");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "4" + ")");
                        }
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "5");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "5");
                        } else
                            screen2.setText(screen2.getText() + "5");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "5");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "5" + ")");
                        }
                    }
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "6");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "6");
                        } else
                            screen2.setText(screen2.getText() + "6");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "6");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "6" + ")");
                        }
                    }
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "7");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "7");
                        } else
                            screen2.setText(screen2.getText() + "7");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "7");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "7" + ")");
                        }
                    }
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "8");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "8");
                        } else
                            screen2.setText(screen2.getText() + "8");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "8");
                    } else {
                        String sc = (String) screen.getText();

                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8)
                        {
                            screen.setText(sc + "8" + ")");
                        }
                    }
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if(icon.getText() == "")
                        {
                            String sc = screen.getText().toString();
                            if(sc.length()==1 && sc.endsWith("0"))
                            {
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            screen.setText(screen.getText() + "9");
                        }
                        else if (icon.getText() == "") {
                            screen.setText(screen.getText() + "9");
                        } else
                            screen2.setText(screen2.getText() + "9");
                    } else if (t == 6) {
                        screen.setText(screen.getText() + "9");
                    } else {
                        String sc = (String) screen.getText();

                        if (sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }

                        if(sc.length()<8 )
                        {
                            screen.setText(sc + "9" + ")");
                        }
                    }
                }
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==0)
                {
                    if (t < 6) {
                        if (icon.getText() == ""  && x==0)
                        {
                            if(screen.getText()=="")
                            {
                                screen.setText("0.");
                            }
                            else
                            {
                                screen.setText(screen.getText() + ".");
                            }
                            x = 1 ;
                        }
                        else if(icon.getText() != "" && y==0)
                        {
                            screen2.setText(screen2.getText() + ".");
                            y = 1;
                        }
                    } else if (t == 6 && x==0) {
                        screen.setText(screen.getText() + ".");
                        x = 1;
                    } else if(t>6 && x==0) {
                        String sc = (String) screen.getText();
                        if(sc.endsWith(")")) {
                            sc = sc.substring(0, sc.length() - 1);
                        }
                        if(sc.length()<7 )
                        {
                            screen.setText(sc + "." + ")");
                            x = 1;
                        }
                    }
                }
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    icon.setText("+");
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 1;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    icon.setText("-");
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 2;
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    icon.setText("×");
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 3;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    icon.setText("÷");
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 4;
                }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    icon.setText("%");
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 5;
                }
            }
        });

        buttonRt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    String s = screen.getText().toString();
                    screen.setText("√" + s);
                    if (screen.getText() == "")
                        screen.setText("0");
                    t = 6;
                    icon.setText("");
                    screen2.setText("");
                }
            }
        });

        buttonBr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t == 0) {
                    try {
                        String rnd = screen.getText().toString();
                        double n = Double.parseDouble(rnd);
                        if (n % 1 == 0) {
                            int xn = (int) n;
                            screen.setText(String.valueOf(xn));
                            x = 0;
                        }
                        else
                        {
                            screen.setText(String.format("%.2f", n));
                            if((n+.01)%1==0)
                            {
                                int xn = (int) n;
                                screen.setText(String.valueOf(xn+1));
                                x = 0;
                            }
                        }
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(MainActivity.this, "no value found to ROUND", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    String s = screen.getText().toString();
                    screen.setText("sin(" + s + ")");
                    t = 7;
                    icon.setText("");
                    screen2.setText("");
                }
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    String s = screen.getText().toString();
                    screen.setText("cos(" + s + ")");
                    t = 8;
                    icon.setText("");
                    screen2.setText("");
                }
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t < 6 && m==0) {
                    String s = screen.getText().toString();
                    screen.setText("tan(" + s + ")");
                    t = 9;
                    icon.setText("");
                    screen2.setText("");
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
                screen2.setText("");
                icon.setText("");
                t = 0;
                m = 0;
                x = 0;
                y = 0;
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (icon.getText() != "" && screen2.getText() != "" && screen.getText() != "") {
                        String sc = (String) screen2.getText();
                        int ln = sc.length();
                        if (ln > 1) {
                            if(sc.endsWith(".")) {
                                y = 0;
                            }
                            sc = sc.substring(0, sc.length() - 1);
                            screen2.setText(sc);
                        } else
                        {
                            screen2.setText("");
                            y = 0;
                        }
                    } else if (screen.getText() != "" && icon.getText() != "" && screen2.getText() == "") {
                        icon.setText("");
                    } else if (screen.getText() != "" && icon.getText() == "" && screen2.getText() == "") {
                        String sc = (String) screen.getText();
                        int ln = sc.length();
                        if(t<7)
                        {
                            if(ln>1)
                            {
                                if(sc.endsWith(".")) {
                                    x = 0;
                                }
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            else
                            {
                                screen.setText("");
                                t = 0;
                                x = 0;
                            }
                        }
                        else
                        {
                            if(ln>4)
                            {
                                if(sc.endsWith(".")) {
                                    x = 0;
                                }
                                sc = sc.substring(0, sc.length() - 1);
                                screen.setText(sc);
                            }
                            else
                            {
                                screen.setText("");
                                t = 0;
                                x = 0;
                            }
                        }
                    } else if (screen.getText() == "" && icon.getText() == "" && screen2.getText() == "") {
                        screen.setText("");
                        t = 0;
                        Toast.makeText(MainActivity.this, "Empty Screen", Toast.LENGTH_SHORT).show();
                    }

                    m = 0;
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Empty Screen", Toast.LENGTH_SHORT).show();
                    screen.setText("");
                    t = 0;
                    m = 0;
                }

            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (icon.getText() != "" && screen2.getText() != "" && screen.getText() != "") {
                        double s1 = Double.parseDouble(screen.getText().toString());
                        double s2 = Double.parseDouble(screen2.getText().toString());

                        if (t == 1) {
                            if (s1 % 1 == 0 && s2 % 1 == 0) {
                                int x1 = (int) s1;
                                int x2 = (int) s2;
                                int ans = x1 + x2;

                                String len = String.valueOf(ans);
                                int ln = len.length();
                                if (ln > 9) {
                                    alert();
                                } else {
                                    screen.setText(String.valueOf(ans));
                                    x = 0;
                                }
                            } else {
                                double an = s1 + s2;
                                int mx = (int) an;
                                String len = String.valueOf(mx);
                                int ln = len.length();
                                if (an % 1 != 0 && ln > 7) {
                                    screen2.setText("max double '7'.0");
                                    t=0;
                                    screen.setText("sorry :)");
                                    icon.setText("");
                                    m=1;
                                } else {
                                    if (an % 1 == 0) {
                                        int a = (int) an;
                                        screen.setText(String.valueOf(a));
                                        x = 0;
                                    } else {
                                        screen.setText(Double.toString(an));
                                    }
                                }
                            }

                            srnCln();
                        } else if (t == 2) {
                            if (s1 % 1 == 0 && s2 % 1 == 0) {
                                int x1 = (int) s1;
                                int x2 = (int) s2;
                                int ans = x1 - x2;

                                String len = String.valueOf(ans);
                                int ln = len.length();
                                if (ln > 9) {
                                    alert();
                                } else {
                                    screen.setText(String.valueOf(ans));
                                    x = 0;
                                }
                            } else {
                                double an = s1 - s2;
                                int mx = (int) an;
                                String len = String.valueOf(mx);
                                int ln = len.length();
                                if (an % 1 != 0 && ln > 7) {
                                    screen2.setText("max double '7'.0");
                                    t=0;
                                    screen.setText("sorry :)");
                                    icon.setText("");
                                    m=1;
                                } else {
                                    if (an % 1 == 0) {
                                        int a = (int) an;
                                        screen.setText(String.valueOf(a));
                                        x = 0;
                                    } else {
                                        screen.setText(Double.toString(an));
                                    }
                                }
                            }

                            srnCln();
                        } else if (t == 3) {
                            if (s1 % 1 == 0 && s2 % 1 == 0) {
                                long x1 = (long) s1;
                                long x2 = (long) s2;
                                long ans = x1 * x2;
                                
                                String len = String.valueOf(ans);
                                long ln = len.length();
                                if (ln > 9) {
                                    alert();
                                } else {
                                    screen.setText(String.valueOf(ans));
                                    x = 0;
                                }
                            } else {
                                double an = s1 * s2;
                                int mx = (int) an;
                                String len = String.valueOf(mx);
                                int ln = len.length();
                                if (an % 1 != 0 && ln > 7) {
                                    screen2.setText("max double '7'.0");
                                    t=0;
                                    screen.setText("sorry :)");
                                    icon.setText("");
                                    m=1;
                                } else {
                                    if (an % 1 == 0) {
                                        int a = (int) an;
                                        screen.setText(String.valueOf(a));
                                        x = 0;
                                    } else {
                                        screen.setText(Double.toString(an));
                                    }
                                }
                            }

                            srnCln();
                        } else if (t == 4) {
                            double an = s1 / s2;
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                }
                            }

                            srnCln();

                        } else if (t == 5) {
                            double an = s1 % s2;
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                }
                            }

                            srnCln();

                        }

                        t = 0;
                    } else if (screen.getText() != "" && icon.getText() != "" && screen2.getText() == "") {
                        screen.setText(screen.getText());
                        icon.setText("");
                    } else if (screen.getText() != "" && icon.getText() == "" && screen2.getText() == "") {
                        if (t == 6) {

                            String sc = (String) screen.getText();
                            sc = sc.substring(1);

                            double an = sqrt(Double.parseDouble(sc));
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                    x = 1;
                                }
                            }
                        } else if (t == 7) {

                            String sc = (String) screen.getText();
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            if(sc.endsWith(")")) {
                                sc = sc.substring(0, sc.length() - 1);
                            }

                            double degrees = Double.parseDouble(sc);
                            double radians = Math.toRadians(degrees);

                            double an = Math.sin(radians);
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                    x = 1;
                                }
                            }

                        } else if (t == 8) {

                            String sc = (String) screen.getText();
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            if(sc.endsWith(")")) {
                                sc = sc.substring(0, sc.length() - 1);
                            }

                            double degrees = Double.parseDouble(sc);
                            double radians = Math.toRadians(degrees);

                            double an = Math.cos(radians);
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                    x = 1;
                                }
                            }

                        } else if (t == 9) {

                            String sc = (String) screen.getText();
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            sc = sc.substring(1);
                            if(sc.endsWith(")")) {
                                sc = sc.substring(0, sc.length() - 1);
                            }

                            double degrees = Double.parseDouble(sc);
                            double radians = Math.toRadians(degrees);

                            double an = Math.tan(radians);
                            int mx = (int) an;
                            String len = String.valueOf(mx);
                            int ln = len.length();
                            if (ln > 9) {
                                alert();
                            } else {
                                if (an % 1 == 0) {
                                    int a = (int) an;
                                    screen.setText(String.valueOf(a));
                                    x = 0;
                                } else {
                                    screen.setText(Double.toString(an));
                                    x = 1;
                                }
                            }

                        } else {
                            screen.setText(screen.getText());
                        }

                        t = 0;
                    }

                }
                catch (Exception e)
                {
                    screen.setText("error..");
                    screen2.setText("Check again.. smthng wrng");
                    icon.setText("");
                }

            }
        });
    }

    public void alert()   //this is for when integer length crossed 9 range then it shows
    {
        screen2.setText("max int range 9");
        t=0;
        screen.setText("Error");
        icon.setText("");
        m=1;

    }

    public void srnCln()  // this for for clear screen2 and icon screen after calculation
    {
        if(m!=1)
        {
            screen2.setText("");
            icon.setText("");
            y=0;
        }
    }

}