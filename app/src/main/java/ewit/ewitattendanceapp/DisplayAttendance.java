package ewit.ewitattendanceapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class DisplayAttendance extends ActionBarActivity {
    LinearLayout parent;
    TextView textView;
    String csTwoArr[], csOneArr[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_attendance);
        String curClass = getIntent().getExtras().getString("classId");
        String temp = new String();
        parent = (LinearLayout) findViewById(R.id.statusParent);


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


        final LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);


        if (curClass.equals("cs2")) {

            for (int i = 0; i < 59; i++) {
                temp = csTwoArr[i];
                ParseQuery<ParseObject> query = ParseQuery.getQuery("CS_2");
                query.getInBackground(temp, new GetCallback<ParseObject>() {
                    public void done(ParseObject object, ParseException e) {
                        if (e == null) {
                            String acc = new String();
                            int att;
                            acc = object.getString("USN");
                            att = object.getInt("Attendance");
                            acc = acc + "       " + att;
                            textView = new TextView(getApplicationContext());
                            textView.setLayoutParams(textParam);
                            textView.setText(acc);
                            parent.addView(textView);
                            // object will be your game score
                        } else {
                            Toast.makeText(getApplicationContext(), "Something went wrong in displaying attendance", Toast.LENGTH_SHORT).show();
                            // something went wrong
                        }
                    }
                });


            }
        } else {
            for (int i = 0; i < 59; i++) {
                temp = csOneArr[i];
                ParseQuery<ParseObject> query = ParseQuery.getQuery("CS_1");
                query.getInBackground(temp, new GetCallback<ParseObject>() {
                    public void done(ParseObject object, ParseException e) {
                        if (e == null) {
                            String acc = new String();
                            int att;
                            acc = object.getString("USN");
                            att = object.getInt("Attendance");
                            acc = acc + "       " + att;
                            textView = new TextView(getApplicationContext());
                            textView.setLayoutParams(textParam);
                            textView.setText(acc);
                            parent.addView(textView);
                            // object will be your game score
                        } else {
                            Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                            // something went wrong
                        }
                    }
                });


            }

        }


    }


}
