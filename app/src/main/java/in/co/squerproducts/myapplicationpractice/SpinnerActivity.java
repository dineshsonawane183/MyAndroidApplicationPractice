package in.co.squerproducts.myapplicationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    TextView tvSpinner;
    Spinner spinner;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        tvSpinner =findViewById(R.id.tvSpinner);
        spinner=findViewById(R.id.spinner);

        List<String> states=new ArrayList<>();
        states.add("Maharashtra");
        states.add("Goa");
        states.add("Madhya Pradesh");
        states.add("Kerala");
        states.add("Gujrat");
        states.add("Rajastan");

        arrayAdapter=new ArrayAdapter(SpinnerActivity.this ,R.layout.activity_select_dialog_item,states);
        /*spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });*/
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tvSpinner.setText("you have Selected :"+parent.getItemAtPosition(position));
                Toast.makeText(SpinnerActivity.this,states.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner.setAdapter(arrayAdapter);

    }
}
