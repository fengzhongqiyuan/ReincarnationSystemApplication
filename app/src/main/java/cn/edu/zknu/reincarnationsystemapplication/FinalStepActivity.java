package cn.edu.zknu.reincarnationsystemapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FinalStepActivity extends AppCompatActivity {
    private Button btnReChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_step);

        btnReChange=(Button)findViewById(R.id.btn_reChange);
        btnReChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FinalStepActivity.this,"既投之则安之，相信您将会有一个幸福的人生！",Toast.LENGTH_LONG).show();
            }
        });
    }
}
