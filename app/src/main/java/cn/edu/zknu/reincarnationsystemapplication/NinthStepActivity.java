package cn.edu.zknu.reincarnationsystemapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class NinthStepActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnReRandom,btnHave,btnNoHave;
    private View dlgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_step);

        btnHave = (Button) findViewById(R.id.btn_have);
        btnNoHave=(Button)findViewById(R.id.btn_noHave);
        btnReRandom=(Button)findViewById(R.id.btn_reRandom);
        btnHave.setOnClickListener(this);
        btnNoHave.setOnClickListener(this);
        btnReRandom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_have:
                showCustomDialog();
                break;
            case R.id.btn_noHave:
                showNoHaveSkip();
                break;
            case R.id.btn_reRandom:
                showAlertDialog();
                break;
        }
    }

    private void showAlertDialog() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(NinthStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }

    private void showNoHaveSkip() {
        Intent intent=new Intent(NinthStepActivity.this,NoHaveSkipActivity.class);
        startActivity(intent);
    }

    private void showCustomDialog() {
        View customView;
        customView=LayoutInflater.from(this).inflate(R.layout.custom_shape_dialog,null);
        AlertDialog alert=new AlertDialog.Builder(this).setView(customView).setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(NinthStepActivity.this,TenthStepActivity.class);
                startActivity(intent);
            }
        }).create();
        alert.show();
    }
}
