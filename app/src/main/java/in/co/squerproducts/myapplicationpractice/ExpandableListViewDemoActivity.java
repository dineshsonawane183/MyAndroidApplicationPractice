package in.co.squerproducts.myapplicationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpandableListViewDemoActivity extends AppCompatActivity {

    List<String> groups;
    Map<String ,List<String>> items;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);
        expandableListView=findViewById(R.id.expandableLV);

        fillData();
        MyCustomAdapterExpandableViewActivity adapter=new MyCustomAdapterExpandableViewActivity(this, groups,(HashMap<String, List<String>>) items);

        expandableListView.setAdapter(adapter);
    }

    private void fillData() {


        groups = new ArrayList<String>();
        items = new HashMap<String, List<String>>();

        // Adding child data
        groups.add("Top 250");
        groups.add("Now Showing");
        groups.add("Coming Soon..");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        items.put(groups.get(0), top250); // Header, Child data
        items.put(groups.get(1), nowShowing);
        items.put(groups.get(2), comingSoon);


    }
}
