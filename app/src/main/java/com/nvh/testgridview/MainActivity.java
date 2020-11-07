package com.nvh.testgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(this, image_details));

        // When the user clicks on the GridItem
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected :"
                        + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Vietnam bbbbbbbbbbbbbbbb", R.drawable.sp1, 98000000);
        Country usa = new Country("United States", R.drawable.sp1, 320000000);
        Country russia = new Country("Russia", R.drawable.sp1, 142000000);
        Country australia = new Country("Australia", R.drawable.sp1, 23766305);
        Country japan = new Country("Japan", R.drawable.sp1, 126788677);
        Country vietnamm = new Country("Vietnam bbbbbbbbbbbbbbbb", R.drawable.sp1, 98000000);
        Country usaa = new Country("United States", R.drawable.sp1, 320000000);
        Country russiaa = new Country("Russia", R.drawable.sp1, 142000000);
        Country australiaa = new Country("Australia", R.drawable.sp1, 23766305);
        Country japann = new Country("Japan", R.drawable.sp1, 126788677);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(australia);
        list.add(japan);
        list.add(vietnamm);
        list.add(usaa);
        list.add(russiaa);
        list.add(australiaa);
        list.add(japann);

        return list;
    }
}