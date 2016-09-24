package ewit.ewitattendanceapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ClassList extends ActionBarActivity {
    Button butOne;
    String cls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_list);
        String user = getIntent().getExtras().getString("user");

        butOne = (Button)findViewById(R.id.classOne);

        if(user.equals("chandan")){
            cls = new String("CS2");
            butOne.setText("CS2");
        }
        else{
            cls = new String("CS1");
            butOne.setText("CS1");
        }
    }

    public void nextAct(View v){
        Intent intent = new Intent(this, StudentList.class);
        intent.putExtra("curClass", cls);
        startActivity(intent);
    }


}
