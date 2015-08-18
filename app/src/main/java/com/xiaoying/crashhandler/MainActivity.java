package com.xiaoying.crashhandler;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void crashTest(View view) {
        String str = null;

        str.equals("aaa");

//        PackageManager pm = getApplicationContext().getPackageManager();
//        try {
//            PackageInfo packageInfo = pm.getPackageInfo(getPackageName(), PackageManager.GET_PERMISSIONS);
//            String [] userPermissions = packageInfo.requestedPermissions;
//            if(null != userPermissions) {
//                for(String userPermision : userPermissions) {
//                    Log.e("AAAAAA", "BBBBBBBBBBBBBBBBBBBBBBBB " + userPermision);
//                }
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }

//        Set<String> set = new HashSet<>();
//        set.add("AAAA");
//        set.add("BBBB");
//        set.add("CCCC");
//
////        Set<String> newSet = new HashSet<>();
////        newSet.add("AAAA");
////        newSet.add("CCCC");
//        List<String> list = new ArrayList<>();
//        list.add("AAAA");
//        list.add("CCCC");
//
//        Log.e("AAAAAAAAAAAA", "BBBBB " + set.containsAll(list));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
