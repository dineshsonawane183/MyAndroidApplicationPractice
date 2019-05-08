package in.co.squerproducts.myapplicationpractice;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {


    private EditText name_et,uname_et,password_et,dob_et;
    RadioGroup rg;
    RadioButton rb;
    Calendar c;
    DatePickerDialog datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

      //HIDE ACTION BAR
        getSupportActionBar().hide();

        name_et=(EditText) findViewById(R.id.regEt1);
        uname_et=(EditText) findViewById(R.id.regEt2);
        password_et=(EditText) findViewById(R.id.regEt3);
        dob_et=(EditText) findViewById(R.id.regEt4);
        rg=(RadioGroup) findViewById(R.id.rg);

//       rb =(RadioButton) findViewById(rg.getCheckedRadioButtonId());


       dob_et.setOnClickListener(new View.OnClickListener() {
     @Override
           public void onClick(View view) {
               System.out.println("called****");
               c=Calendar.getInstance();
              int year=c.get(Calendar.YEAR);
               int month=c.get(Calendar.MONTH);
               int dayOfMonth=c.get(Calendar.DAY_OF_MONTH);

               datePicker=new DatePickerDialog(RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                    dob_et.setText(day+"/"+(month+1)+"/"+year);
                   }
               },year,month,dayOfMonth);
               datePicker.show();
           }



        /*   @Override
           public void onClick(View v) {
               Calendar calendar = Calendar.getInstance();
               int yy = calendar.get(Calendar.YEAR);
               int mm = calendar.get(Calendar.MONTH);
               int dd = calendar.get(Calendar.DAY_OF_MONTH);
               calendar.set(yy,mm,dd);

               DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                       final String date = dayOfMonth+"-"+(month+1)+"-"+year;
                       SimpleDateFormat pdf =new SimpleDateFormat("dd-MM-yyyy");
                       try {
                           Date date1= pdf.parse(date);
                           SimpleDateFormat pdf2 =new SimpleDateFormat("dd-MM-yyyy");
                           String converteddate =pdf2.format(date1);
                           dob_et.setText(converteddate);

                       }
                       catch(ParseException e){
                           e.printStackTrace();
                       }
                   }
               },yy,mm,dd);
               datePickerDialog.show();
           }*/
       });

    }

    public void register(View v){
        rb = rg.findViewById(rg.getCheckedRadioButtonId());
        String gender="";
        String name=name_et.getText().toString();
        String username=uname_et.getText().toString();
        String password=password_et.getText().toString();
        String dob=dob_et.getText().toString();
        if(rb.getId()==R.id.f){
         gender="Female" ;
         }else if(rb.getId()==R.id.m){
            gender="Male";
        }

        Intent intent =new Intent(RegisterActivity.this, ShowDetailsActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("username",username);
        intent.putExtra("password",password);
        intent.putExtra("dob",dob);
        intent.putExtra("gender",gender);
        startActivity(intent);
    String message="Name : "+name +"\n Username :"+username+"\n Password : "+password +"\n DOB :"+dob+"\nGender :"+gender;
        Toast.makeText(RegisterActivity.this ,message,Toast.LENGTH_LONG).show();



    }
}
