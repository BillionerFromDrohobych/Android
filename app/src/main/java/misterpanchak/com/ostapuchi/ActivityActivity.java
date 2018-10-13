package misterpanchak.com.ostapuchi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityActivity extends AppCompatActivity {
List<City> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        cityList = new ArrayList<>();
        cityList.add(new City("Kiev", "https://i.imgur.com/fOiqyPB.jpg",0, "s"));
        cityList.add(new City("Drohobych","https://www.google.com.ua/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwis-vHYiP3dAhWNposKHShRA_YQjRx6BAgBEAU&url=http%3A%2F%2Fgeohistory.today%2Fkiev%2F&psig=AOvVaw3QJl4J7OBkSWGIe-aJce-R&ust=1539301930932710", 0, "0"));
        cityList.add(new City("Lviv","https://www.google.com.ua/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwis-vHYiP3dAhWNposKHShRA_YQjRx6BAgBEAU&url=http%3A%2F%2Fgeohistory.today%2Fkiev%2F&psig=AOvVaw3QJl4J7OBkSWGIe-aJce-R&ust=1539301930932710", 0, "0"));
        /*cityList.add(new City("London",R.drawable.london, 0, "0"));
        cityList.add(new City("Kharkov",R.drawable.kharkiv, 0, "0"));*/
        RecyclerView rv = (RecyclerView) findViewById(R.id.cityRecyclerView);
        RecyclerViewAdapter adp = new RecyclerViewAdapter(this, cityList);
        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.setAdapter(adp);
    }
}
