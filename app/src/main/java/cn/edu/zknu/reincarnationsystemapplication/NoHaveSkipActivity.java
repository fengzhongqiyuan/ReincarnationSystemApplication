package cn.edu.zknu.reincarnationsystemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class NoHaveSkipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_have_skip);

        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                Intent intent=new Intent(NoHaveSkipActivity.this,FinalStepActivity.class);
                startActivity(intent);

            }

        };
        time.schedule(task, 1000 * 3);
    }
}
