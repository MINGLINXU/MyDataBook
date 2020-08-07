package sg.edu.rp.webservices.mydatabook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class AboutUsActivity extends AppCompatActivity {

    TextView tv;
    ActionBar ab;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        iv = findViewById(R.id.imageView);
        Picasso.with(this).load( "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg").error(R.drawable.error).placeholder(R.drawable.ajax_loader).into(iv);
        tv = findViewById(R.id.tvContent);
        tv.setText("C347 - Android Programming II " + "\n" + "Republic Polytechnic");

    }
}