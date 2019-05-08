package in.co.squerproducts.myapplicationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import in.co.squerproducts.myapplicationpractice.Adapter.MyCustomAdapter;
import in.co.squerproducts.myapplicationpractice.fragments.MainFragmentActivity;

public class CustomListViewActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;


    private static String[] values = {
            "Calculator", "Alert Dialogue", "Register Activity", "Web view Demo", "List View Demo", "Expandable List View Demo",
            "Time Picker Demo", "Autocomplete TextView Demo", "Seekbar Demo", " Check box Demo","Spinner Demo","Fragment Demo"
    };
    private static Integer[] images = {
            R.drawable.add, R.drawable.alert, R.drawable.register, R.drawable.web,
            R.drawable.custom_list_view, R.drawable.custom_list_view, R.drawable.custom_list_view,
            R.drawable.custom_list_view, R.drawable.custom_list_view, R.drawable.custom_list_view,
            R.drawable.custom_list_view,R.drawable.web
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView = findViewById(R.id.listView);

        MyCustomAdapter adapter = new MyCustomAdapter(this, values, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        startActivity(new Intent(CustomListViewActivity.this, AdditionActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(CustomListViewActivity.this, alert_dialogueActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(CustomListViewActivity.this, RegisterActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(CustomListViewActivity.this, WebViewImplActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(CustomListViewActivity.this, ListViewDemoActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(CustomListViewActivity.this, ExpandableListViewDemoActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(CustomListViewActivity.this, TimePickerActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(CustomListViewActivity.this, AutocompleteActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(CustomListViewActivity.this, SeekbarActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(CustomListViewActivity.this, CheckBoxDemoActivity.class));
                        break;
                    case 10:
                        startActivity(new Intent(CustomListViewActivity.this, SpinnerActivity.class));
                        break;
                    case 11:
                        startActivity(new Intent(CustomListViewActivity.this, MainFragmentActivity.class));
                        break;
                }

            }
        });
    }
}
