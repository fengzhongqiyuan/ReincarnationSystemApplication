package cn.edu.zknu.reincarnationsystemapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdStepActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMan,btnWoman,btnStore;
    private View dlgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_step);

        btnMan=(Button)findViewById(R.id.btn_man);
        btnWoman=(Button)findViewById(R.id.btn_woman);
        btnStore=(Button)findViewById(R.id.btn_store);
        btnStore.setOnClickListener(this);
        btnMan.setOnClickListener(this);
        btnWoman.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_man:
                toFourthStep();
                break;
            case R.id.btn_woman:
                showAlertDialog();
                break;
            case R.id.btn_store:
                Toast.makeText(this,"对不起，您的VIP等级不足",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void showAlertDialog() {
        dlgView= LayoutInflater.from(this).inflate(R.layout.thirdalertdialog,null);
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(dlgView).setPositiveButton("去充值", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent toRechargeIntent=new Intent(ThirdStepActivity.this,RechargeActivity.class);
                startActivity(toRechargeIntent);
            }
        }).create();
        alertDialog.show();
    }
    private void toFourthStep() {
        Intent toFourthIntent=new Intent(this,FourthStepActivity.class);
        startActivity(toFourthIntent);
    }
}
