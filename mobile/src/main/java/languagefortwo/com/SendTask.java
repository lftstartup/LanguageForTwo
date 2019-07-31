package languagefortwo.com;

import android.os.Bundle;
import android.content.Intent;
import java.io.*;
import java.io.IOException;
import java.net.*;
import java.lang.*;
import android.view.*;
import android.widget.Button;
import java.net.Socket;
import android.os.AsyncTask;
import android.app.Activity;
import android.widget.Toast;

public class SendTask extends AsyncTask<String, String, String>
{
    private Activity activity;

    protected String doInBackground(String... args)
    {
        String username = args[0];
        String password = args[1];
        try {
            System.out.println("first line");
            Socket socket = new Socket("52.16.211.175", 12345);
            System.out.println("socket creating");
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            DataInputStream din = new DataInputStream(socket.getInputStream());

            try {
                dout.writeUTF(username + "," + password);
                dout.flush();
                String str = din.readUTF();//in.readLine();

                if (str.equals("confirmed")) {


                    return "confirmed";
                } else {

                    return "not confirmed";
                }
            }
            finally {
                try
                {
                    dout.close();

                }catch(Exception e)
                {
                    System.out.println("h");
                }
                try
                {
                    din.close();
                }catch(Exception e){
                    System.out.println("h");
                }
                socket.close();

            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return "not confirmed";

        }



    }
    protected void onPostExecute(String result) {

        if(result.equals("confirmed"))
        {
            Toast.makeText(activity, result, Toast.LENGTH_LONG).show();

            activity.startActivity(new Intent(activity, MainActivity.class));
            System.out.println("confirmed");
        }
        else
        {
            Toast.makeText(activity, result, Toast.LENGTH_LONG).show();

            activity.startActivity(new Intent(activity, LoginActivity.class));
            System.out.println("not confirmed");
        }


    }

}
