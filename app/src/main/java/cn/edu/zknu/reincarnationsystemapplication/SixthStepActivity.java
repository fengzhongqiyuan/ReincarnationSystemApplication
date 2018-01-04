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

public class SixthStepActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnGaoFuShuai,btnFu,btnGuan,btnJun,btnCombo,btnPoorB,btnStore;
    private View dlgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_step);

        btnGaoFuShuai=(Button)findViewById(R.id.btn_gaofushuai);
        btnFu=(Button)findViewById(R.id.btn_fu);
        btnGuan=(Button)findViewById(R.id.btn_guan);
        btnJun=(Button)findViewById(R.id.btn_jun);
        btnCombo=(Button)findViewById(R.id.btn_combo);
        btnPoorB=(Button)findViewById(R.id.btn_poorb);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnGaoFuShuai.setOnClickListener(this);
        btnFu.setOnClickListener(this);
        btnGuan.setOnClickListener(this);
        btnJun.setOnClickListener(this);
        btnCombo.setOnClickListener(this);
        btnPoorB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_gaofushuai:
                showAlertDlg();
                break;
            case R.id.btn_fu:
                showAlertDlg();
                break;
            case R.id.btn_guan:
                showAlertDlg();
                break;
            case R.id.btn_jun:
                showAlertDlg();
                break;
            case R.id.btn_combo:
                showAlertDlg();
                break;
            case R.id.btn_poorb:
                toSeventhStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toSeventhStep() {
        Intent toSeventhIntent=new Intent(this,SeventhStepActivity.class);
        startActivity(toSeventhIntent);
    }

    private void showAlertDlg() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(SixthStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }
}
