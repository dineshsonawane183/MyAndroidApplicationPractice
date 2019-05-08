package in.co.squerproducts.myapplicationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdditionActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tvAns;
    Button btnAdd,btnMult,btnDevide ,btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        tvAns=(TextView)findViewById(R.id.tvAns);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMult=(Button)findViewById(R.id.btnMult);
        btnDevide=(Button)findViewById(R.id.btnDevide);
    }

    public  void add(View v){

        Double i=Double.parseDouble(et1.getText().toString());
        Double j=Double.parseDouble(et2.getText().toString());
        Double k=i+j;
        tvAns.setText("Ans is :"+k);

    }

    public  void sub(View v){

        Double i=Double.parseDouble(et1.getText().toString());
        Double j=Double.parseDouble(et2.getText().toString());
        Double k=i-j;
        tvAns.setText("Ans is :"+k);

    }
    public  void multiply(View v){

        Double i=Double.parseDouble(et1.getText().toString());
        Double j=Double.parseDouble(et2.getText().toString());
        Double k=i*j;
        tvAns.setText("Ans is :"+k);

    }


    public  void devide(View v){

        Double i=Double.parseDouble(et1.getText().toString());
        Double j=Double.parseDouble(et2.getText().toString());

        try {
            Double k=i/j;
            tvAns.setText("Ans is :"+k);

        }catch(Exception e){
            tvAns.setText(e.getMessage());

            }


    }
}
