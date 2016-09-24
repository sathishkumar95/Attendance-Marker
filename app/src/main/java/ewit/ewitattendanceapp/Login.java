package ewit.ewitattendanceapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        username = (EditText)findViewById(R.id.loginEditText);
        password = (EditText)findViewById(R.id.passEditText);

        String user = username.getText().toString();
        String pass = password.getText().toString();

        if( (user.equals("chandan") && pass.equals("basementlab") )  || ( user.equals("deepu") && pass.equals("fourthfloor")  )  ){
            //call the next activity and pass the username and password
            Toast.makeText(this,"Logging in... ",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ClassList.class);
            if(user.equals("chandan")){
                intent.putExtra("user","chandan");
            }else{
                intent.putExtra("user", "deepu");
            }
            startActivity(intent);

        }else{
            Toast.makeText(this,"Wrong username or password",Toast.LENGTH_LONG).show();
        }
    }
}
