package in.co.squerproducts.myapplicationpractice;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class TimePickerActivity extends AppCompatActivity {
    TimePickerDialog timePicker;

    TextView textView ,tvSelectedTime ,selectedTime;
    EditText etSelectTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        Thread mThread=null;
        Runnable runnable=new showTime();
        mThread=new Thread(runnable);
        mThread.start();

        tvSelectedTime=findViewById(R.id.TextViewSelectedTime);
        etSelectTime=findViewById(R.id.selectTime);
        selectedTime=findViewById(R.id.selectedTime);

        etSelectTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calender=Calendar.getInstance();
                int hourOfDay=calender.get(Calendar.HOUR_OF_DAY);
                int minute=calender.get(Calendar.MINUTE);

                timePicker=new TimePickerDialog(TimePickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String AM_PM ;
                        etSelectTime.setText(hourOfDay+":"+minute);
                        if(hourOfDay < 12) {
                            AM_PM = "AM";
                        } else {
                            AM_PM = "PM";
                            hourOfDay=hourOfDay-12;
                        }

                        selectedTime.setText(hourOfDay+":"+minute +" "+AM_PM);
                        selectedTime.setVisibility(View.VISIBLE);
                        tvSelectedTime.setVisibility(View.VISIBLE);
                    }
                },hourOfDay ,minute ,false);
                timePicker.show();
            }
        });

    }

    private  class  showTime implements Runnable{

        @Override
        public void run() {
            try{

                while(true){
                    calculateAndDisplayTime();
                    Thread.sleep(1000);
                }
            }catch (Exception ie){

                Thread.currentThread().interrupt();
            }

        }

        private void calculateAndDisplayTime() {
            String secondsInString;
            textView=findViewById(R.id.currentTime);

            Calendar c = Calendar.getInstance();

            int seconds = c.get(Calendar.SECOND);
            if(seconds<=9){
                secondsInString ="0"+seconds;
            }else{
                 secondsInString=seconds+"";
            }
            int minutes = c.get(Calendar.MINUTE);
            int hour = c.get(Calendar.HOUR_OF_DAY);
            String time = hour + ":" + minutes + ":" + secondsInString;
            textView.setText(time);
        }
    }
}
