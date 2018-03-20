package com.example.rtc30.loaddata;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Locale.ROOT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private File root;




    @Override
    protected void onStart() {
        super.onStart();
        fn_getData();
    }

    public void fn_getData(){
        Log.i("message","test");
        root = Environment.getDownloadCacheDirectory();
        File file = new File("/");
        Log.e("message",file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.listFiles().length);

        //主路徑
        File[] dir = file.listFiles();
        //印出路徑下的所有資料夾
        for(int i =0;i<file.listFiles().length;i++){
            System.out.println(dir[i]);
        }
        getDir();
    }

    public void getDir(){
        Log.e("TAG","getDir");
        // /res/images/charger
//        File file = new File("/res/images/charger");
//        File[] dir2 = file.listFiles();
//
//        System.out.println(file.listFiles().length);
//        for(int i =0;i<file.listFiles().length;i++){
//            System.out.println(dir2[i]);
//        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File("/storage");
                File[] dir2 = file.listFiles();

                System.out.println(file.listFiles().length);
                for(int i =0;i<file.listFiles().length;i++){
                    System.out.println(dir2[i]);
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            thread.interrupt();
            e.printStackTrace();
        }finally {

        }
    }

//    FilenameFilter filenameFilter = new FilenameFilter() {
//        private String[] filter = {".pdf"};
//
//        @Override
//        public boolean accept(File file, String filename) {
//
//            for (int i =0;i<filter.length;i++){
//                if(filename.indexOf(filter[i]) != -1)
//                    return true;
//            }
//
//            return false;
//        }
//    };
}
