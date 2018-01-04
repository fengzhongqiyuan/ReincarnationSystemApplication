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

public class FourthStepActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnEasy,btnMedium,btnDifficult,btnChasm,btnStore;
    private View dlgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_step);

        btnEasy=(Button)findViewById(R.id.btn_easy);
        btnMedium=(Button)findViewById(R.id.btn_medium);
        btnDifficult=(Button)findViewById(R.id.btn_difficult);
        btnChasm=(Button)findViewById(R.id.btn_chasm);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnEasy.setOnClickListener(this);
        btnMedium.setOnClickListener(this);
        btnDifficult.setOnClickListener(this);
        btnChasm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_easy:
                showAlertDlg();
                break;
            case R.id.btn_medium:
                showAlertDlg();
                break;
            case R.id.btn_difficult:
                showAlertDlg();
                break;
            case R.id.btn_chasm:
                toFifthStep();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void toFifthStep() {
        Intent toFifthIntent=new Intent(this,FifthStepActivity.class);
        startActivity(toFifthIntent);
    }

    private void showAlertDlg() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(FourthStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }
}
