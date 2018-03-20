package com.example.rtc30.loaddata;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FilenameFilter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn_getData();
    }

    private File root;

    public void fn_getData(){
        Log.i("message","test");
        root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String path = root.getPath();
        File folder = new File(path);
        System.out.println(path);

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
