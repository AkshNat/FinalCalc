package com.example.akshaya.finalcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, mod, eq, dec, c;
    EditText ed;
    int m1, m2;
    boolean ma = false, ms = false, mm = false, md = false, mmod = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        eq = (Button) findViewById(R.id.eq);
        dec = (Button) findViewById(R.id.dec);
        c = (Button) findViewById(R.id.C);
        ed = (EditText) findViewById(R.id.ed);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m1 = Integer.parseInt(ed.getText() + "");
                    ma = true;
                    ed.setText(null);

                } else {
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m1 = Integer.parseInt(ed.getText() + "");
                    ms = true;
                    ed.setText(null);
                } else {
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m1 = Integer.parseInt(ed.getText() + "");
                    mm = true;
                    ed.setText(null);
                } else {
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m1 = Integer.parseInt(ed.getText() + "");
                    md = true;
                    ed.setText(null);
                } else {
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m1 = Integer.parseInt(ed.getText() + "");
                    mmod = true;
                    ed.setText(null);
                } else {
                }
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((ed.getText().length()) != 0) {
                    m2 = Integer.parseInt(ed.getText() + "");
                    //m2 = Float.parseFloat(ed.getText() + "");

                    if (ma == true) {

                        ed.setText(m1 + m2 + "");
                        ma = false;
                    }


                    if (ms == true) {
                        ed.setText(m1 - m2 + "");
                        ms = false;
                    }

                    if (mm == true) {
                        ed.setText(m1 * m2 + "");
                        mm = false;
                    }

                    if (md == true) {
                        ed.setText(m1 / m2 + "");
                        md = false;
                    }

                    if (mmod == true) {
                        ed.setText(m1 % m2 + "");
                        mmod = false;
                    }
                } else {
                }
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText() + ".              ");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
            }
        });


    }
}