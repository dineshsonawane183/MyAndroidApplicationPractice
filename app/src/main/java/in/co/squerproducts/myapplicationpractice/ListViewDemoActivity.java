package in.co.squerproducts.myapplicationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

import in.co.squerproducts.myapplicationpractice.fragments.MainFragmentActivity;

public class ListViewDemoActivity extends AppCompatActivity {

    ListView listView;
    private String[] values={
            "Simple Calculator" ,"Alert Dialogue" ,"Register Activity" ,"Web view Demo" ,
            "Custom List View ","Expandable List View Demo" ,"Time Picker Demo" ,"Autocomplete TextView Demo"
            ,"Seekbar Demo", " Check box Demo","Spinner Demo","Fragment Example"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView=(ListView)findViewById(R.id.listView);

        //R.layout.activity_list_view_text_view only contains texview
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.activity_list_view_text_view, Arrays.asList(values));

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){

                    case 0:
                        startActivity(new Intent(ListViewDemoActivity.this, AdditionActivity.class ));
                        break;
                    case 1:
                        startActivity(new Intent(ListViewDemoActivity.this, alert_dialogueActivity.class ));
                        break;
                    case 2:
                        startActivity(new Intent(ListViewDemoActivity.this,RegisterActivity.class ));
                        break;
                    case 3:
                        startActivity(new Intent(ListViewDemoActivity.this, WebViewImplActivity.class ));
                        break;
                    case 4:
                        startActivity(new Intent(ListViewDemoActivity.this, CustomListViewActivity.class ));
                        break;
                    case 5:
                        startActivity(new Intent(ListViewDemoActivity.this, ExpandableListViewDemoActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(ListViewDemoActivity.this, TimePickerActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(ListViewDemoActivity.this, AutocompleteActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(ListViewDemoActivity.this, SeekbarActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(ListViewDemoActivity.this, CheckBoxDemoActivity.class));
                        break;
                    case 10:
                        startActivity(new Intent(ListViewDemoActivity.this, SpinnerActivity.class));
                        break;
                    case 11:
                        startActivity(new Intent(ListViewDemoActivity.this, MainFragmentActivity.class));
                        break;
                }

            }
        });
    }
}
