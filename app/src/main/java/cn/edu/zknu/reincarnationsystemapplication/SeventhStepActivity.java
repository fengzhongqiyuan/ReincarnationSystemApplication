package cn.edu.zknu.reincarnationsystemapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeventhStepActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMakeMoney, btnBaMei, btnArt, btnWorkMan, btnMoveBrick, btnHair,btnStore;
    private View dlgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_step);

        btnMakeMoney = (Button) findViewById(R.id.btn_makemoney);
        btnBaMei = (Button) findViewById(R.id.btn_bamei);
        btnArt = (Button) findViewById(R.id.btn_art);
        btnWorkMan = (Button) findViewById(R.id.btn_workman);
        btnMoveBrick = (Button) findViewById(R.id.btn_movebrick);
        btnHair = (Button) findViewById(R.id.btn_hair);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnMakeMoney.setOnClickListener(this);
        btnBaMei.setOnClickListener(this);
        btnArt.setOnClickListener(this);
        btnWorkMan.setOnClickListener(this);
        btnMoveBrick.setOnClickListener(this);
        btnHair.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_makemoney:
                showAlertDlg();
                break;
            case R.id.btn_bamei:
                showAlertDlg();
                break;
            case R.id.btn_art:
                showAlertDlg();
                break;
            case R.id.btn_workman:
                showAlertDlg();
                break;
            case R.id.btn_movebrick:
                showAlertDlg();
                break;
            case R.id.btn_hair:
                toEighthStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toEighthStep() {
        Intent toSeventhIntent=new Intent(this,EighthStepActivity.class);
        startActivity(toSeventhIntent);
    }

    private void showAlertDlg() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(SeventhStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }
}