package com.example.administrator.fragment_add_dynamic;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        if (d.getWidth() < d.getHeight()) {

//        1  拿到 Fragment管理器
            FragmentManager fragmentManager1 = getFragmentManager();   // v4 包需要getSupportFragmentManager() 来获取FragmentManager
//       2 通过Fragment 拿到Fragment事物
            FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
// 3 实例一个碎片
            Fragment1 fragment1 = new Fragment1();
            // 4 把碎片放到布局中
            fragmentTransaction1.replace(android.R.id.content, fragment1);
//        5 添加到返回栈中
            fragmentTransaction1.addToBackStack(null);
//        6 提交事务
            fragmentTransaction1.commit();
        } else {

//        1  拿到 Fragment管理器
            FragmentManager fragmentManager2 = getFragmentManager();
//       2 通过Fragment 拿到Fragment事物
            FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
// 3 实例一个碎片
            Fragment2 fragment2 = new Fragment2();
            //    4 把碎片放到布局中
            fragmentTransaction2.replace(android.R.id.content, fragment2);
//        5 添加到返回栈中
            fragmentTransaction2.addToBackStack(null);
//        6 提交事务
            fragmentTransaction2.commit();
        }
    }
}
