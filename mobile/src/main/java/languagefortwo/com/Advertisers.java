package languagefortwo.com;
import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.Toast;

public class Advertisers extends AppCompatActivity {
    //buttons defenition
    private Button homeButton = null;
    private Button aboutusButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //displays the xml page of this page.
        setContentView(R.layout.advertisers);

        //displaying the data
        Intent i = getIntent();
        String recieved = i.getStringExtra("advertiser");
        TextView textView = (TextView)findViewById(R.id.adText);
        String currentText = String.valueOf(textView.getText());
        if (recieved != null){
            textView.setText(currentText + "\n" + recieved);
        }



        //a button to the home page
        homeButton = (Button) findViewById(R.id.goMainActivity);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity.class);
                startActivity(i);
            }
        });
        //a button to the about us page
        aboutusButton = (Button) findViewById(R.id.goSecondActivity);
        aboutusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SecondActivity.class);
                startActivity(i);
            }
        });

    }
}
