package languagefortwo.com;
import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;

public class BecomeAdvertiser extends AppCompatActivity {
    private Button homeButton = null;
    private Button advertisersButton = null;
    private Button adFormButton = null;
    private EditText mEdit;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.become_advertiser);
        homeButton = (Button) findViewById(R.id.goMainActivity);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity.class);
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

        //send form
        adFormButton = (Button) findViewById(R.id.adForm);
        adFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Advertisers.class);
                //getting the advertiser input
                mEdit   = (EditText)findViewById(R.id.sendAdvertiser);
                String input = mEdit.getText().toString();

                i.putExtra("advertiser", input);
                startActivity(i);
            }
        });
    }
}
