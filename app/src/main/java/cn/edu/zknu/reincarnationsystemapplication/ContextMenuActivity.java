package cn.edu.zknu.reincarnationsystemapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContextMenuActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        listView=(ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
    }
}
