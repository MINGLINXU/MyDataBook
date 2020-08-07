package sg.edu.rp.webservices.mydatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        tv = findViewById(R.id.tvContent);
        tv.setText("C347 - Android Programming II " + "\n" + "Republic Polytechnic");

    }
}