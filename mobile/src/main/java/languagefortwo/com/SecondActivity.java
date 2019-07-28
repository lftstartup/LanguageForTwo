package languagefortwo.com;
import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;

    public class SecondActivity extends AppCompatActivity {
        private Button homeButton = null;
        private Button advertisersButton = null;
        private Button adFormButton = null;
        private EditText mEdit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
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


        }
    }


