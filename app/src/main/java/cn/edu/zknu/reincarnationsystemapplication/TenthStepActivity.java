package cn.edu.zknu.reincarnationsystemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
class MyThread extends Thread {
//    public void skip() {
//        try {
//            sleep(1000);
//        }catch (InterruptedException e){}
//    }
}
public class TenthStepActivity extends AppCompatActivity {
    private TextView tvSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_step);
        tvSkip=(TextView)findViewById(R.id.tv_skip);
        Timer time = new Timer();
//        for(int i=3;i>0;i--){
//            tvSkip.setText(i+"秒后跳转");
//            new MyThread().skip();
//        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                Intent intent=new Intent(TenthStepActivity.this,FinalStepActivity.class);
                startActivity(intent);

            }

        };
        time.schedule(task, 1000 * 3);

    }
}
