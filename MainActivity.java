package com.example.selva.findday;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonn(View v)
    {
        Toast ToastMessage = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG);
    }



    int key=0;
    public void onBackPressed() {
        if(key == 1)
        {
            finish();
        }
        else
        {
            Toast ToastMessage = Toast.makeText(getApplicationContext(), " Develop by \uD83C\uDFF9 \uD83C\uDDF8 \uD83C\uDDEA \uD83C\uDDF1 \uD83C\uDDFB \uD83C\uDDE6 \uD83C\uDDF0 \uD83C\uDDFA \uD83C\uDDF2 \uD83C\uDDE6 \uD83C\uDDF7 ♥️️", Toast.LENGTH_SHORT);
            ToastMessage.setGravity( 16,0,1000);
            ToastMessage.show();
            key++;
        }
    }










    public void onButtonClick(View v) {
       try
       {
           EditText e1 = (EditText) findViewById(R.id.editText2);
           EditText e2 = (EditText) findViewById(R.id.editText3);
           EditText e3 = (EditText) findViewById(R.id.editText4);

           int date=Integer.parseInt(e1.getText().toString());
           int month=Integer.parseInt(e2.getText().toString());
           int year=Integer.parseInt(e3.getText().toString());

           int ayear=0,E=0,total=0;
           if ((date >= 1 && date <= 31 && month == 1) || (date >= 1 && date <= 31 && month == 3) || (date >= 1 && date <= 30 && month == 4) || (date >= 1 && date <= 31 && month == 5) || (date >= 1 && date <= 30 && month == 6) || (date >= 1 && date <= 31 && month == 7) || (date >= 1 && date <= 31 && month == 8) || (date >= 1 && date <= 30 && month == 9) || (date >= 1 && date <= 31 && month == 10) || (date >= 1 && date <= 30 && month == 11) || (date >= 1 && date <= 31 && month == 12) || (date >= 1 && date <= 29 && month == 2 && year % 4 == 0) || (date >= 1 && date <= 28 && month == 2 && year % 4 != 0))
           {
               //YEAR CALCULATION
               int a=year%100;
               int b=year-a;
               if(b%400==0)
               {
                   ayear=0;
               }
               else if((b+100)%400==0)
               {
                   ayear=1;
               }
               else if((b+200)%400==0)
               {
                   ayear=2;
               }
               else if((b+300)%400==0)
               {
                   ayear=3;
               }
               int c=a/4;
               int d=c+a;
               d=d%7;

               E=d+ayear;

               // System.out.println("Year is :%d",E);
               //MONTH CALCULATION


               if((month == 1) && (year % 400 == 0))
               {
                   month = 5;
               }
               if((month == 2) && (year % 400 == 0))
               {
                   month = 1;
               }
               if((month==2 && (year%400 != 0))||month==3||month==11)
               {
                   month=2;
               }
               else if((month==1 && (year %400 != 0))||month==10)
               {
                   month=6;
               }
               else if(month==4||month==7)
               {
                   month=5;
               }
               else if(month==5)
               {
                   month=0;
               }
               else if(month==6)
               {
                   month=3;
               }
               else if(month==8)
               {
                   month=1;
               }
               else if(month==9||month==12)
               {
                   month=4;
               }


               //System.out.println("\nMonth is :%d",month);
               //DATE CALCULATION

               if(date>=7)
               {
                   date=date%7;
               }
               //System.out.println("\nDate is :%d",date);


               total=(E+month+date)%7;
               //System.out.println("\n%d is belong to ",total);
               TextView textView;
               textView = (TextView) findViewById(R.id.e5);

               switch(total)
               {
                   case 0:textView.setText("\uD83D\uDE0DSUNDAY\uD83D\uDE0D");
                       Toast ToastMessage = Toast.makeText(getApplicationContext(), "Don't take rest after first victory because if u fail in second,more lips are waiting to say that first victory was just luck", Toast.LENGTH_LONG);
                       ToastMessage.setGravity(16, 0, 500);
                       ToastMessage.show();
                       break;
                   case 1:textView.setText("\uD83D\uDE0DMONDAY\uD83D\uDE0D");
                       Toast ToastMessag = Toast.makeText(getApplicationContext(), "Good decision r come from Experience,But Experience comes from the bad decision.This is life...So don't worry for any mistake .Go head & learn from them.", Toast.LENGTH_LONG);
                       ToastMessag.setGravity(16, 0, 500);
                       ToastMessag.show();
                       break;
                   case 2:textView.setText("\uD83D\uDE0DTUESDAY\uD83D\uDE0D");
                       Toast ToastMes = Toast.makeText(getApplicationContext(), "Mistake r painful when they happen,But years later a collection of mistake is called EXPERIANCE Which lets u to success ", Toast.LENGTH_LONG);
                       ToastMes.setGravity(16, 0, 500);
                       ToastMes.show();
                       break;
                   case 3:textView.setText("\uD83D\uDE0DWEDNESDAY\uD83D\uDE0D");
                       Toast ToastMe = Toast.makeText(getApplicationContext(), "One best book is Equal to Hundred friends,But one GOOD FRIEND is equal to the A library", Toast.LENGTH_LONG);
                       ToastMe.setGravity(16, 0, 500);
                       ToastMe.show();
                       break;
                   case 4:textView.setText("\uD83D\uDE0DTHURSDAY\uD83D\uDE0D");
                       Toast ToastM = Toast.makeText(getApplicationContext(), "The person who never made a mistake never tried anything new", Toast.LENGTH_LONG);
                       ToastM.setGravity(16, 0, 500);
                       ToastM.show();
                       break;
                   case 5:textView.setText("\uD83D\uDE0DFRIDAY\uD83D\uDE0D");
                       Toast ToastMess = Toast.makeText(getApplicationContext(), "Failure will never overtake me if my definition to success is strong enough", Toast.LENGTH_LONG);
                       ToastMess.setGravity(16, 0, 500);
                       ToastMess.show();
                       break;
                   case 6:textView.setText("\uD83D\uDE0DSATURDAY\uD83D\uDE0D");
                       Toast ToastMessa = Toast.makeText(getApplicationContext(), "Dreams is not what u see in the sleep is the thing which doesn't let u sleep", Toast.LENGTH_LONG);
                       ToastMessa.setGravity(16, 0, 500);
                       ToastMessa.show();
                       break;
                   default:;
               }
           }
           else
           {
               TextView textView;
               textView = (TextView) findViewById(R.id.e5);
               textView.setText("\uD83D\uDE44 \uD83D\uDE21 \uD83D\uDE21 \uD83D\uDE44");
               Toast ToastMessaa = Toast.makeText(getApplicationContext(),  "PLEASE ENTER THE VALID DATE!!", Toast.LENGTH_LONG);
               ToastMessaa.setGravity(16, 0, 500);
               ToastMessaa.show();
           }

       }
       catch(Exception e)
        {
            Toast ToastMessage = Toast.makeText(getApplicationContext(), "\uD83D\uDC79 INPUT FIELD SHOULDN'T BE EMPTY \uD83D\uDC79", LENGTH_SHORT);
            ToastMessage.setGravity(16, 0, 500);
            ToastMessage.show();

        }
    }
}
