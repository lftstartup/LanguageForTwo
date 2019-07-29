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

public class SendTask extends AsyncTask<String, String, String>
{

    protected String doInBackground(String... args)
    {
        String username = args[0];
        String password = args[1];
        try {
            System.out.println("first line");
            Socket socket = new Socket("127.0.0.1", 12345);
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

}
