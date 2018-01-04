package cn.edu.zknu.reincarnationsystemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondStepActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAccept,btnReject,btnStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_step);

        btnAccept=(Button)findViewById(R.id.btn_acceptrecharge);
        btnReject=(Button)findViewById(R.id.btn_rejectrecharge);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnAccept.setOnClickListener(this);
        btnReject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_acceptrecharge:
                recharge();
                break;
            case R.id.btn_rejectrecharge:
                toThirdStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toThirdStep() {
        Intent toThirdIntent=new Intent(this,ThirdStepActivity.class);
        startActivity(toThirdIntent);
    }

    private void recharge() {
        Intent rechargeIntent=new Intent(this,RechargeActivity.class);
        startActivity(rechargeIntent);
    }
}
