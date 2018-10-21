package misterpanchak.com.ostapuchi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

public class ActivityActivity extends AppCompatActivity {

List<City> cityList;

SearchView sc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        cityList = new ArrayList<>();
        cityList.add(new City("Kiev", R.drawable.kiev,"", "s",false));
        cityList.add(new City("Lviv",R.drawable.lviw, "", "0",false));
        cityList.add(new City("Drohobych",R.drawable.drogobych, "", "0",false));
       cityList.add(new City("London",R.drawable.london, "", "0",false));
        cityList.add(new City("Kharkov",R.drawable.kharkiv, "", "0",false));
        RecyclerView rv = (RecyclerView) findViewById(R.id.cityRecyclerView);
        RecyclerViewAdapter adp = new RecyclerViewAdapter(this, cityList);
//        sc = (SearchView) findViewById(R.id.searcview1);

        rv.setLayoutManager(new GridLayoutManager(this,1));
        rv.setAdapter(adp);
    }


}
