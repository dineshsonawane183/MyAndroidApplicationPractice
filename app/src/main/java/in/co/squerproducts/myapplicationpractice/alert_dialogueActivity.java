package in.co.squerproducts.myapplicationpractice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class alert_dialogueActivity extends AppCompatActivity {


    Button btnName ,btnBal;
    TextView textView ,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialogue);

        btnName=findViewById(R.id.btnName);
        btnBal=findViewById(R.id.btnBal);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);

        btnName.setOnClickListener(view ->{
            textView.setText("Dinesh");
        });
/*
        btnBal.setOnClickListener(view ->{

            AlertDialog.Builder builder=new  AlertDialog.Builder(alert_dialogueActivity.this);

            builder.setMessage("Are you sure?");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    textView2.setText("500000");
                }
            })
            .setNegativeButton("Cancel", null);

            builder.show();
        });
*/

        btnBal.setOnClickListener(view ->{

            View Loginview= LayoutInflater.from(alert_dialogueActivity.this).inflate(R.layout.activity_login,null);
            EditText etUserName,etPassWord;
            etUserName=Loginview.findViewById(R.id.etUserName12);
            etPassWord=Loginview.findViewById(R.id.etPassword12);




            AlertDialog.Builder builder=new  AlertDialog.Builder(alert_dialogueActivity.this);

            builder.setMessage("Please Provide Credentials!")
                    .setView(Loginview)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String Username=etUserName.getText().toString();
                    String passsword=etPassWord.getText().toString();
                    Toast.makeText(alert_dialogueActivity.this,"username:"+Username+"\npassword:"+passsword,Toast.LENGTH_LONG).show();
                    textView2.setText("500000");
                }
            })
                    .setNegativeButton("Cancel", null);

            builder.show();
        });

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Really Exit?")
                .setMessage("Are you sure?")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alert_dialogueActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("Cancel" ,null)
                .setCancelable(false);
        builder.show();
    }
}
