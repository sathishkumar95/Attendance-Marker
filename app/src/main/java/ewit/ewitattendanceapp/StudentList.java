package ewit.ewitattendanceapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class StudentList extends ActionBarActivity {
    LinearLayout parent, child;
    TextView textView;
    CheckBox checkBox;
    Button button;
    String csTwoArr[], csOneArr[];
    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        csTwoArr = new String[59];
        csOneArr = new String[59];




        csOneArr[0] = "skJCDcwc76";
        csOneArr[1] = "JMWa4uxdbI";
        csOneArr[2] = "WOyVGBPiDZ";
        csOneArr[3] = "PMwDzEtR7R";
        csOneArr[4] = "vGzED52Yr6";
        csOneArr[5] = "tDM05e5QDJ";
        csOneArr[6] = "sV9Nxuq2Js";
        csOneArr[7] = "lZyEo0nW9e";
        csOneArr[8] = "O7HBeXLn2H";
        csOneArr[9] = "lNTodrWaIN";
        csOneArr[10] = "PJTvJ5zgm5";
        csOneArr[11] = "7yJKZtANUl";
        csOneArr[12] = "W8OxmwsOmG";
        csOneArr[13] = "PnajDBW3uX";
        csOneArr[14] = "amwpjJTowJ";
        csOneArr[15] = "4KPkxzuBGf";
        csOneArr[16] = "DCltObEyxz";
        csOneArr[17] = "ppeZCCCJMM";
        csOneArr[18] = "vXlKISABd6";
        csOneArr[19] = "PlmDUp08HY";
        csOneArr[20] = "66EP7sKMaf";
        csOneArr[21] = "8cMguLiiBd";
        csOneArr[22] = "zIa4JhBrhr";
        csOneArr[23] = "7kxITciwz7";
        csOneArr[24] = "XW8H9aeq5C";
        csOneArr[25] = "aCJ7O8OpS1";
        csOneArr[26] = "c8QveVks7g";
        csOneArr[27] = "ycrqob4bd5";
        csOneArr[28] = "KMj5xc8qgk";
        csOneArr[29] = "XAcoqAKxF2";
        csOneArr[30] = "0Xa10FGAnG";
        csOneArr[31] = "QavSCIoMhA";
        csOneArr[32] = "zeMTihxHxy";
        csOneArr[33] = "UeGLbRrk4k";
        csOneArr[34] = "DanzmtfY6m";
        csOneArr[35] = "8hxBOtpOJJ";
        csOneArr[36] = "v8dRVUvUBB";
        csOneArr[37] = "76GymoHTQO";
        csOneArr[38] = "5ZDdToOEiU";
        csOneArr[39] = "CqnlRBPRxX";
        csOneArr[40] = "ghSj5KolWK";
        csOneArr[41] = "veNPVhYc0I";
        csOneArr[42] = "7lphenzq8w";
        csOneArr[43] = "QBXgnbM6rZ";
        csOneArr[44] = "StmKaSpgik";
        csOneArr[45] = "4IzGjA8Cw8";
        csOneArr[46] = "lXNntOnWng";
        csOneArr[47] = "peI4mWxmgD";
        csOneArr[48] = "JJAkhC8Y3p";
        csOneArr[49] = "4aaQ3lx3wy";
        csOneArr[50] = "59fghUyEaJ";
        csOneArr[51] = "YFBaO5Z6tP";
        csOneArr[52] = "Tbvi1ScDzm";
        csOneArr[53] = "awnBqgv7A2";
        csOneArr[54] = "mKUGojZLBz";
        csOneArr[55] = "ztfFctlZJ1";
        csOneArr[56] = "b71nfmseil";
        csOneArr[57] = "uda6L5kZV2";
        csOneArr[58] = "cn6ryjlNJg";


        csTwoArr[0] = "KpjB3dRP0R";
        csTwoArr[1] = "F6hMU2aKYl";
        csTwoArr[2] = "gdN8uAe7oQ";
        csTwoArr[3] = "6LznYzwIyv";
        csTwoArr[4] = "j5rY5tConl";
        csTwoArr[5] = "Tdziwe3EuP";
        csTwoArr[6] = "zUPEzs15fn";
        csTwoArr[7] = "zWy2xffaXl";
        csTwoArr[8] = "0CH5bC7jkQ";
        csTwoArr[9] = "iDIzbrkTHR";
        csTwoArr[10] = "JhDOVyTzH0";
        csTwoArr[11] = "AAyePIeHfw";
        csTwoArr[12] = "gbLR5zABNj";
        csTwoArr[13] = "KA3yzn46ZH";
        csTwoArr[14] = "l6LvBV3ZRk";
        csTwoArr[15] = "ugpi9DmdPU";
        csTwoArr[16] = "V1TDTd8maU";
        csTwoArr[17] = "kQZ7ylVz7P";
        csTwoArr[18] = "9CQ1jXHJKq";
        csTwoArr[19] = "HdMY6UoMrq";
        csTwoArr[20] = "WqwFeC6tBP";
        csTwoArr[21] = "NvB9P8j85g";
        csTwoArr[22] = "9FQXPJXPcz";
        csTwoArr[23] = "ww8fPJQvBF";
        csTwoArr[24] = "nOuf5iacUs";
        csTwoArr[25] = "IxQc93hbd5";
        csTwoArr[26] = "lqA6IYAgzK";
        csTwoArr[27] = "fRmRXhIe4G";
        csTwoArr[28] = "KYlHbSaWVn";
        csTwoArr[29] = "dMHoluTOVc";
        csTwoArr[30] = "GItMm6Yvc3";
        csTwoArr[31] = "BWx64daskB";
        csTwoArr[32] = "6T9gmJVSiC";
        csTwoArr[33] = "8JFP3k2y9B";
        csTwoArr[34] = "fXTmqTcayD";
        csTwoArr[35] = "dWRygLdvN5";
        csTwoArr[36] = "cBUotyOQfV";
        csTwoArr[37] = "44oOStPZfO";
        csTwoArr[38] = "3GLORecPIG";
        csTwoArr[39] = "S0YkZdSRi7";
        csTwoArr[40] = "KSpi5G3c7Y";
        csTwoArr[41] = "CLZu6colOC";
        csTwoArr[42] = "4YHcAa19BZ";
        csTwoArr[43] = "SG70SWwxhI";
        csTwoArr[44] = "8oeSSY6nLy";
        csTwoArr[45] = "9OpaLLK1Cg";
        csTwoArr[46] = "rqWa5LEbDt";
        csTwoArr[47] = "9SBcB362ab";
        csTwoArr[48] = "OLaLq6vnT6";
        csTwoArr[49] = "4HVSgZVR7w";
        csTwoArr[50] = "idOfS5zlIw";
        csTwoArr[51] = "21JYVBUacd";
        csTwoArr[52] = "uCT9XaPLzy";
        csTwoArr[53] = "XlJdA5QszE";
        csTwoArr[54] = "1J6MNsfWDl";
        csTwoArr[55] = "jUYqBp9jZX";
        csTwoArr[56] = "DeIBx4Hsip";
        csTwoArr[57] = "Uyx5kEdsHI";
        csTwoArr[58] = "PjRqEOZ8nI";





        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "eSnBcO07WaLZVQc386ZP8lQhG67uiKadNH4XmJbo", "1CshX3UT7ftGYkvY3RhAdpDRtWmvc2DS0PlBE91n");

        String cls = getIntent().getExtras().getString("curClass");

        LinearLayout.LayoutParams paramLin = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams checkParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams butParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        parent = (LinearLayout) findViewById(R.id.parentLayout);


        int j = 0;



        if(cls.equals("CS2")){
            j = 0;


            for (int i = 71; i <= 135; i++){
                if( (i == 77) || (i == 80) || (i == 84) || (i == 106) || (i == 126) || (i == 132))
                    continue;

                child = new LinearLayout(this);
                child.setLayoutParams(paramLin);

                textView = new TextView(this);
                textView.setLayoutParams(textParam);
                if(i < 100)
                    textView.setText("1ew13cs0" + i);
                else
                    textView.setText("1ew13cs" + i);

                child.addView(textView);

                checkBox = new CheckBox(this);
                checkBox.setLayoutParams(checkParam);
                checkBox.setId(2000 + j);
                j++;
                child.addView(checkBox);

                parent.addView(child);
            }


            View.OnClickListener submitListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    for(int i = 0; i < 59; i++) {
                        checkBox = (CheckBox) findViewById(2000 + i);

                        if(checkBox.isChecked() == false){
                        //get attendance, increment it by 1 and update it
                            String temp=csTwoArr[i];









                            ParseQuery<ParseObject> query=ParseQuery.getQuery("CS_2");
                            query.getInBackground(temp, new GetCallback<ParseObject>() {
                                public void done(ParseObject object, ParseException e) {
                                    if (e == null) {
                                        t = object.getInt("Attendance");
                                        // object will be your game score
                                    } else {
                                        Toast.makeText(getApplicationContext(), "Something went wrong in getting data", Toast.LENGTH_SHORT).show();
                                        // something went wrong
                                    }
                                }
                            });




                            t++;







                            ParseQuery<ParseObject> querys = ParseQuery.getQuery("CS_2");
                            querys.getInBackground(temp, new GetCallback<ParseObject>() {
                                public void done(ParseObject getobject, ParseException e) {
                                    if (e == null) {
                                        // Now let's update it with some new data. In this case, only cheatMode and score
                                        // will get sent to the Parse Cloud. playerName hasn't changed.
                                        getobject.put("Attendance", t);
                                        getobject.saveInBackground();
                                    }
                                    else {
                                        Toast.makeText(getApplicationContext(), "Something went wrong in setting data", Toast.LENGTH_SHORT).show();
                                        // something went wrong
                                    }
                                }
                            });









                        }

                    }

                    Intent intent = new Intent(getApplicationContext(), DisplayAttendance.class);
                    intent.putExtra("classId","cs2");
                    startActivity(intent);

                }
            };


            button = new Button(this);
            button.setLayoutParams(butParam);
            button.setOnClickListener(submitListener);
            button.setText("Submit");
            parent.addView(button);

        }else{
            j = 100;
            for (int i = 1; i <= 70; i++){
                if(  (i == 10) || (i == 28) || (i == 33) || (i == 34) || (i == 37) || (i == 42) || (i == 47) || (i == 56) || (i == 57) || (i == 64) || (i == 65) ){
                    continue;
                }




                child = new LinearLayout(this);
                child.setLayoutParams(paramLin);

                textView = new TextView(this);
                textView.setLayoutParams(textParam);
                textView.setText("1ew13cs0" + i);
                child.addView(textView);

                checkBox = new CheckBox(this);
                checkBox.setLayoutParams(checkParam);
                checkBox.setId(2000 + j);
                j++;
                child.addView(checkBox);

                parent.addView(child);
            }


            View.OnClickListener submitListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    for(int i = 0; i < 59; i++) {
                        checkBox = (CheckBox) findViewById(2100 + i);

                        if(checkBox.isChecked() == false){
                            //get attendance, increment it by 1 and update it
                            String temp=csTwoArr[i];






                            ParseQuery<ParseObject> query=ParseQuery.getQuery("CS_1");
                            query.getInBackground(temp, new GetCallback<ParseObject>() {
                                public void done(ParseObject object, ParseException e) {
                                    if (e == null) {
                                        t = object.getInt("Attendance");
                                        // object will be your game score
                                    } else {
                                        Toast.makeText(getApplicationContext(), "Something went wrong in getting data", Toast.LENGTH_SHORT).show();
                                        // something went wrong
                                    }
                                }
                            });




                            t++;







                            ParseQuery<ParseObject> querys = ParseQuery.getQuery("CS_1");
                          querys.getInBackground(temp, new GetCallback<ParseObject>() {
                                public void done(ParseObject getobject, ParseException e) {
                                    if (e == null) {
                                        // Now let's update it with some new data. In this case, only cheatMode and score
                                        // will get sent to the Parse Cloud. playerName hasn't changed.
                                        getobject.put("Attendance", t);
                                        getobject.saveInBackground();
                                    }
                                    else {
                                        Toast.makeText(getApplicationContext(), "Something went wrong in setting data", Toast.LENGTH_SHORT).show();
                                        // something went wrong
                                    }
                                }
                            });










                        }

                    }


                    Intent intent = new Intent(getApplicationContext(), DisplayAttendance.class);
                    intent.putExtra("classId","cs1");
                    startActivity(intent);

                }
            };


            Button button = new Button(this);
            button.setLayoutParams(butParam);
            button.setOnClickListener(submitListener);
            button.setText("Submit");
            parent.addView(button);

        }

    }



}
