package misterpanchak.com.ostapuchi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SightActivity extends AppCompatActivity {
TextView textView;
ImageView imgview;
ImageButton imageButton;
Intent intent1;
    String geo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        int imgurl = intent.getExtras().getInt("imgurl");
       geo = intent.getExtras().getString("location");
        imgview = (ImageView) findViewById(R.id.imageView2);
        textView = (TextView) findViewById(R.id.textView);
        imageButton = (ImageButton)  findViewById(R.id.imageButton);
        textView.setText(name);
        imgview.setImageResource(imgurl);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SightActivity.this, "it",Toast.LENGTH_LONG).show();
                intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(geo));
                startActivity(intent1);
            }
        });

    }

    }
