package in.co.squerproducts.myapplicationpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowDetailsActivity extends AppCompatActivity {

    TextView tvName, tvUserName ,tvPassword ,tvGender ,tvDOB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        tvName =(TextView) findViewById(R.id.tvName);
        tvUserName =(TextView) findViewById(R.id.tvUserName);
        tvPassword =(TextView) findViewById(R.id.tvPassword);
        tvGender =(TextView) findViewById(R.id.tvGender);
        tvDOB =(TextView) findViewById(R.id.tvDOB);

       Intent intent=getIntent();
       String name=intent.getStringExtra("name");
       String username=intent.getStringExtra("username");
       String password=intent.getStringExtra("password");
       String dob=intent.getStringExtra("dob");
       String gender=intent.getStringExtra("gender");

        tvName.setText(name);
        tvUserName.setText(username);
        tvPassword.setText(password);
        tvGender.setText(gender);
        tvDOB.setText(dob);


        }


}
