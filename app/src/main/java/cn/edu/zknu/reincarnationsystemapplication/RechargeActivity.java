package cn.edu.zknu.reincarnationsystemapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RechargeActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvServe;
    private ImageView img;
    private View serveView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);

        tvServe=(TextView)findViewById(R.id.tv_serve);
        img=(ImageView)findViewById(R.id.iv_img);
        tvServe.setOnClickListener(this);
        registerForContextMenu(img);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_serve:
                serve();
                break;
        }
    }
    private void serve() {
        serveView= LayoutInflater.from(this).inflate(R.layout.activity_serve,null);
        AlertDialog serveDialog=new AlertDialog.Builder(this).setView(serveView).create();
        serveDialog.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, Menu.FIRST,1,"保存到手机");
        menu.add(0, Menu.FIRST+1,2,"扫描二维码");
        menu.add(0, Menu.FIRST+2,3,"取消");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case Menu.FIRST:
                Toast.makeText(this,"图片已保存",Toast.LENGTH_SHORT).show();
                break;
            case Menu.FIRST+1:
                Toast.makeText(this,"此二维码疑包含诈骗信息，系统已帮您自动拦截",Toast.LENGTH_SHORT).show();
                break;
            case Menu.FIRST+2:
               // Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
