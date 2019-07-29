package languagefortwo.com;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import java.io.*;
import java.io.IOException;
import java.net.*;
import java.lang.*;
import android.view.*;
import android.widget.Button;
import languagefortwo.com.SendTask;
import java.net.Socket;
import android.os.AsyncTask;

public class LoginActivity extends AppCompatActivity{

    private Button homeButton = null;
    String username = "noam1";
    String password = "xzaq1234";
    public void onCreate(Bundle savedInstanceState)
    {

        //start the page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        homeButton = (Button) findViewById(R.id.goMainActivity);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //executing!!!!
                new SendTask().execute(username, password);
//                SendTask send = new SendTask();
//                if (send.doInBackground(username,password) == "confirmed")
//                {
//                    Intent i = new Intent(view.getContext(), MainActivity.class);
//                    System.out.println("confirmed");
//                    startActivity(i);
//                }
//                else
//                {
//                    Intent i = new Intent(view.getContext(), LoginActivity.class);
//                    startActivity(i);
//                    System.out.println("not confirmed");
//                }






            }
        });

    }


}
