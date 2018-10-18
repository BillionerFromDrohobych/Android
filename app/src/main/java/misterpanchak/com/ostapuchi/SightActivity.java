package misterpanchak.com.ostapuchi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SightActivity extends AppCompatActivity {
TextView textView;
ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        int imgurl = intent.getExtras().getInt("imgurl");
        imgview = (ImageView) findViewById(R.id.imageView2);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(name);
        imgview.setImageResource(imgurl);

    }
}
