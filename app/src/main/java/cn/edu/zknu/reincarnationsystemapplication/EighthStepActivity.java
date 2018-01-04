package cn.edu.zknu.reincarnationsystemapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class EighthStepActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton ibLiHong, ibMeiZha, ibRandom;
    private View dlgView;
    private Button btnStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth_step);

        ibLiHong = (ImageButton) findViewById(R.id.ib_lihong);
        ibMeiZha = (ImageButton) findViewById(R.id.ib_meizha);
        ibRandom = (ImageButton) findViewById(R.id.ib_random);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        ibLiHong.setOnClickListener(this);
        ibMeiZha.setOnClickListener(this);
        ibRandom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib_lihong:
                showAlertDlg();
                break;
            case R.id.ib_meizha:
                showAlertDlg();
                break;
            case R.id.ib_random:
                toNinthStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toNinthStep() {
        Intent toNinthIntent=new Intent(this,NinthStepActivity.class);
        startActivity(toNinthIntent);
    }

    private void showAlertDlg() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(EighthStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }
}