package qianfeng.menuapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBar supportActionBar = getSupportActionBar();

        // 可以看到左边导航栏的后退一级按键
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        supportActionBar.setTitle("title");
        supportActionBar.setSubtitle("subTitle");

        supportActionBar.setIcon(R.mipmap.ic_launcher);


    }


    // 做返回上一级的点击事件

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this,"我是左上角的返回上一级的按钮",Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting:
                Toast.makeText(this,"设置",Toast.LENGTH_SHORT).show();
                break;

            case R.id.a21:
                Toast.makeText(this,"二级菜单1",Toast.LENGTH_SHORT).show();
                break;

            case R.id.a22:
                Toast.makeText(this,"二级菜单2",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m31:
                Toast.makeText(this,"三级菜单1",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m32:
                Toast.makeText(this,"三级菜单2",Toast.LENGTH_SHORT).show();
                break;




        }

        return super.onOptionsItemSelected(item);
    }

    //现在做右上角的按钮吧，溢出菜单栏是这样做的

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);


        return true; // 返回true，代表菜单已经创建完成了
    }



}
