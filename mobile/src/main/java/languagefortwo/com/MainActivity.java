package languagefortwo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.view.*;
import android.widget.Button;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{
    private Button aboutusButton = null;
    EditText mEdit;
    private Button advertisersButton = null;
    private Button becomeAdvertiserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //about us
        aboutusButton = (Button) findViewById(R.id.goSecondActivity);
        aboutusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), LoginActivity.class);
                startActivity(i);
            }
        });
        advertisersButton = (Button) findViewById(R.id.goAdvertisers);
        advertisersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Advertisers.class);

                startActivity(i);
            }
        });
        becomeAdvertiserButton = (Button) findViewById(R.id.becomeAdvertiser);
        becomeAdvertiserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), BecomeAdvertiser.class);
                startActivity(i);
            }
        });


    }
}
