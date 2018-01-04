package cn.edu.zknu.reincarnationsystemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnWantRein,btnStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWantRein=(Button)findViewById(R.id.btn_wantrein);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnWantRein.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_wantrein:
                toSecondStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toSecondStep() {
        Intent toSecondIntent=new Intent(this,SecondStepActivity.class);
        startActivity(toSecondIntent);
    }
}
