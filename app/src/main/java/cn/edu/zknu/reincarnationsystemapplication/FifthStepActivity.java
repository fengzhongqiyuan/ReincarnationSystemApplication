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

public class FifthStepActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnEurope, btnAmerica, btnAfrica,btnJapan, btnChina,btnStore;
    private View alertView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_step);

        btnEurope = (Button) findViewById(R.id.btn_Europe);
        btnAmerica = (Button) findViewById(R.id.btn_America);
        btnAfrica = (Button) findViewById(R.id.btn_Africa);
        btnJapan=(Button)findViewById(R.id.btn_Japan);
        btnChina = (Button) findViewById(R.id.btn_China);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnEurope.setOnClickListener(this);
        btnAmerica.setOnClickListener(this);
        btnAfrica.setOnClickListener(this);
        btnJapan.setOnClickListener(this);
        btnChina.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Europe:
                showAlertDlg();
                break;
            case R.id.btn_America:
                showAlertDlg();
                break;
            case R.id.btn_Africa:
                showAlertDlg();
                break;
            case R.id.btn_Japan:
                showMsg();
                break;
            case R.id.btn_China:
                toSixthStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void showMsg() {
        Toast.makeText(this,"客官不可以，程序猿大大正在努力开辟中...",Toast.LENGTH_LONG).show();
    }

    private void showAlertDlg() {
        alertView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(alertView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(FifthStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }

    private void toSixthStep() {
        Intent toSixthIntent=new Intent(this,SixthStepActivity.class);
        startActivity(toSixthIntent);
    }
}