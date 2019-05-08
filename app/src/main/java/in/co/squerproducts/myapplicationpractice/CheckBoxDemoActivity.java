package in.co.squerproducts.myapplicationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxDemoActivity extends AppCompatActivity {

    CheckBox checkIOS, checkAndroid, checkJava;
    TextView tvCheckBox;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);

        checkIOS = findViewById(R.id.CheckIOS);
        checkAndroid = findViewById(R.id.CheckAndroid);
        checkJava = findViewById(R.id.CheckJava);
        btnCheck = findViewById(R.id.btnCheckBox);
        tvCheckBox = findViewById(R.id.tvCheckBox);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> CheckedBoxes = new ArrayList<>();
                if (checkIOS.isChecked()) {
                    CheckedBoxes.add("IOS");
                }
                if (checkJava.isChecked()) {
                    CheckedBoxes.add("Java");
                }
                if (checkAndroid.isChecked()) {
                    CheckedBoxes.add("Android");
                }
                String str = null;
                for (String x : CheckedBoxes) {
                    if (str == null) {
                        str = x;
                    } else {
                        str = str + ", " + x;
                    }
                }
                tvCheckBox.setText("You selected :" + str);

            }
        });
    }
}
