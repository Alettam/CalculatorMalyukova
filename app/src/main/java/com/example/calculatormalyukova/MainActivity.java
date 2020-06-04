package com.example.calculatormalyukova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,
            buttonClean,buttonChange,buttonPercent, btnDivision,btnMultiplication,btnSubtraction,btnAddition,btnEqual;

    String sum="",one,two,three,four,five,
            six,seven,eight,nine,zero;

    Float result=0f,result_mul=1f,result_div=1f;
    String EditTextMsg;
    Float floatEditTextMsg;
    int c;

    TextView infoTextView;


    char press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                if(sum !="")
                {
                    zero=(String)button0.getText();

                    sum=sum+zero;
                    infoTextView.setText(sum);
                }
                else
                {
                    sum="0";
                    infoTextView.setText("0");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                one=(String)button1.getText();
                sum=sum+one;

                infoTextView.setText(sum);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                two=(String)button2.getText();
                sum=sum+two;

                infoTextView.setText(sum);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                three=(String)button3.getText();
                sum=sum+three;

                infoTextView.setText(sum);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                four=(String)button4.getText();
                sum=sum+four;

                infoTextView.setText(sum);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                five=(String)button5.getText();
                sum=sum+five;

                infoTextView.setText(sum);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                six=(String)button6.getText();
                sum=sum+six;

                infoTextView.setText(sum);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                seven=(String)button7.getText();
                sum=sum+seven;

                infoTextView.setText(sum);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                eight=(String)button8.getText();
                sum=sum+eight;

                infoTextView.setText(sum);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press=='=')
                {
                    onClickListenerReset(buttonClean);
                }

                nine=(String)button9.getText();
                sum=sum+nine;

                infoTextView.setText(sum);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int error=0;

                if(sum !=null)
                {
                    for(int i=0;i<sum.length();i++)
                    {
                        if(sum.charAt(i)=='.')
                        {
                            error=1;
                            break;
                        }
                    }

                }

                if(error==0)
                {
                    if(sum==null)
                    {
                        sum=sum+"0.";
                    }
                    else
                    {
                        sum=sum+".";
                    }
                }

                infoTextView.setText(sum);
            }
        });




    }

    //сложение
    public void onClickListenerPlus(View v)
    {

        if(press=='-')
        {
            onClickListenerEqual(btnSubtraction);
        }
        else if(press=='*')
        {
            onClickListenerEqual(btnMultiplication);
        }

        else if(press=='/')
        {
            onClickListenerEqual(btnDivision);
        }


        press='+';

        if(sum != "")
        {
            result=result+Float.parseFloat(infoTextView.getText().toString());

            infoTextView.setText(result.toString());

            result_mul=result;

            result_div=result;

            sum="";
        }
        else
        {
            infoTextView.setText(result.toString());

            result_mul=result;

            result_div=result;

            sum="";
        }

    }

    public void onClickListenerEqual(View v) {
        if(press=='+')
        {
            onClickListenerPlus(btnAddition);
            //msg1= editText.getText().toString();
            //floatMsg=Float.parseFloat(msg1);
        }
        else if(press=='-')
        {
            onClickListenerMinus(btnSubtraction);
        }
        else if(press=='*')
        {
            onClickListenerMultiply(btnMultiplication);
        }
        else if(press=='/')
        {
            onClickListenerDivide(btnDivision);
        }

        press='=';
    }

    // вычитание
    public void onClickListenerMinus(View v)
    {
        if(press=='+')
        {
            onClickListenerEqual(btnAddition);
        }
        else if(press=='*')
        {
            onClickListenerEqual(btnMultiplication);
        }
        else if(press=='/')
        {
            onClickListenerEqual(btnDivision);
        }



        press='-';

        EditTextMsg= infoTextView.getText().toString();
        floatEditTextMsg=Float.parseFloat(EditTextMsg);

        if(sum==""  && result==0)
        {
            sum=sum+'-';
        }
        else if(sum != "")
        {
            if(result==0)
            {
                result=Float.parseFloat(sum)-result;

                infoTextView.setText(result.toString());

                result_mul=result;

                result_div=result;

                sum="";
            }

            else
            {
                result=result-Float.parseFloat(sum);

                infoTextView.setText(result.toString());

                result_mul=result;

                result_div=result;

                sum="";
            }
        }

    }

    // умножение
    public void onClickListenerMultiply(View v)
    {

        if(press=='/')
        {
            onClickListenerEqual(btnDivision);
        }
        else if(press=='+')
        {
            onClickListenerEqual(btnAddition);
        }

        else if(press=='-')
        {
            onClickListenerEqual(btnSubtraction);
        }



        press='*';

        EditTextMsg= infoTextView.getText().toString();
        floatEditTextMsg=Float.parseFloat(EditTextMsg);

        if(sum !="")
        {
            result_mul=result_mul * floatEditTextMsg;

            result=result_mul;

            result_div=result_mul;

            infoTextView.setText(result_mul.toString());

            sum="";
        }
        else
        {
            infoTextView.setText(EditTextMsg);

            sum="";
        }

    }

    // деление
    public void onClickListenerDivide(View v)
    {

        if(press=='+')
        {
            onClickListenerEqual(btnAddition);
        }

        else if(press=='-')
        {
            onClickListenerEqual(btnSubtraction);
        }

        else if(press=='*')
        {
            onClickListenerEqual(btnMultiplication);
        }

        press='/';

        EditTextMsg= infoTextView.getText().toString();
        floatEditTextMsg=Float.parseFloat(EditTextMsg);

        if(sum !="" && result_div==1)
        {
            //int c=0;

            if(c==0)
            {
                result_div=floatEditTextMsg/result_div;
                Log.d("if if result_div=", result_div.toString());
                c++;
            }
            else
            {
                result_div=result_div/floatEditTextMsg;
                Log.d("if else result_div=", result_div.toString());
            }


            result=result_div;
            result_mul=result_div;

            infoTextView.setText(result_div.toString());

            sum="";
        }
        else if(sum !="" && result_div !=1)
        {
            result_div=result_div/floatEditTextMsg;

            Log.d("else if result_div=", result_div.toString());

            result=result_div;

            result_mul=result_div;

            infoTextView.setText(result_div.toString());

            sum="";
        }
        else
        {
            infoTextView.setText(EditTextMsg);

            sum="";
        }
    }

    public void onClickListenerReset(View v)
    {

        sum="";

        result=0f;
        result_mul=1f;
        result_div=1f;
        press=' ';
        c=0;

        infoTextView.setText(result.toString());
    }

    public void onClickListenerChange(View v){
        if(press=='+')
        {
            onClickListenerEqual(btnAddition);
        }

        else if(press=='-')
        {
            onClickListenerEqual(btnSubtraction);
        }

        else if(press=='*')
        {
            onClickListenerEqual(btnMultiplication);
        }

        result=-1 * Float.parseFloat(infoTextView.getText().toString());
        infoTextView.setText(result.toString());
        result_mul=result;
        result_div=result;
        sum="";

    }

    public void onClickListenerPercent (View v){


        EditTextMsg= infoTextView.getText().toString();
        if (result == 0) {
            floatEditTextMsg=Float.parseFloat(EditTextMsg)/100;
        }else {
            floatEditTextMsg=Float.parseFloat(EditTextMsg)*result/100;
        }

        infoTextView.setText(floatEditTextMsg.toString());
        sum = floatEditTextMsg.toString();

    }
    private void initview() {
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
        buttonDot = findViewById(R.id.buttonDot);
        infoTextView = findViewById(R.id.infoTextView);
        btnAddition = findViewById(R.id.buttonAddition);
        btnEqual = findViewById(R.id.buttonEqual);
        btnMultiplication = findViewById(R.id.buttonMultiplication);
        btnSubtraction = findViewById(R.id.buttonSubtraction);
        btnDivision = findViewById(R.id.buttonDivision);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonChange = findViewById(R.id.buttonChange);
        buttonClean = findViewById(R.id.buttonClean);

    }
}
