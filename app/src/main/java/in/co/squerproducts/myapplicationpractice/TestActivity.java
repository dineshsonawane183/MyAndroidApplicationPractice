package in.co.squerproducts.myapplicationpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    TextView btnOp1, btnOp2, btnOp3, btnOp4;
    TextView tvAns;
    Button btnAns;
    String selectedButton = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btnOp1 = findViewById(R.id.option1);
        btnOp2 = findViewById(R.id.option2);
        btnOp3 = findViewById(R.id.option3);
        btnOp4 = findViewById(R.id.option4);
        tvAns = findViewById(R.id.tvAns);
        btnAns = findViewById(R.id.btnAns);


        btnOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOp1.setBackgroundColor(Color.YELLOW);
                btnOp2.setBackgroundColor(Color.GRAY);
                btnOp3.setBackgroundColor(Color.GRAY);
                btnOp4.setBackgroundColor(Color.GRAY);
                selectedButton = "btnOp1";

            }
        });
        btnOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOp1.setBackgroundColor(Color.GRAY);
                btnOp2.setBackgroundColor(Color.YELLOW);
                btnOp3.setBackgroundColor(Color.GRAY);
                btnOp4.setBackgroundColor(Color.GRAY);
                selectedButton = "btnOp2";


            }
        });
        btnOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOp1.setBackgroundColor(Color.GRAY);
                btnOp2.setBackgroundColor(Color.GRAY);
                btnOp3.setBackgroundColor(Color.YELLOW);
                btnOp4.setBackgroundColor(Color.GRAY);
                selectedButton = "btnOp3";

            }

        });
        btnOp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOp1.setBackgroundColor(Color.GRAY);
                btnOp2.setBackgroundColor(Color.GRAY);
                btnOp3.setBackgroundColor(Color.GRAY);
                btnOp4.setBackgroundColor(Color.YELLOW);
                selectedButton = "btnOp4";

            }
        });


        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedButton.equals("")) {

                    Toast.makeText(TestActivity.this,"Please select field",Toast.LENGTH_SHORT).show();
                }
                if (selectedButton.equals("btnOp1")) {

                    tvAns.setText(btnOp1.getText());
                }
                if (selectedButton.equals("btnOp2")) {

                    tvAns.setText(btnOp2.getText());
                }

                if (selectedButton.equals("btnOp3")) {

                    tvAns.setText(btnOp3.getText());
                }

                if (selectedButton.equals("btnOp4")) {

                    tvAns.setText(btnOp4.getText());
                }
            }
        });

    }


}
