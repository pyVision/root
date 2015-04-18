package com.example.androidopencv_v1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;



import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Environment;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;


public class AndroidOpenCV_v1 extends Activity {
    private Preview mPreview;
    private DrawOnTop mDrawOnTop;
    public static String APPLICATION_DIR=Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the window title and set full screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Window W= getWindow();
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        W.requestFeature(Window.FEATURE_NO_TITLE); 
        W.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);  
        //W.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        W.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Create our Preview view and set it as the content of our activity.
        // Create our DrawOnTop view.
        mDrawOnTop = new DrawOnTop(this);
        mPreview = new Preview(this, mDrawOnTop);
        setContentView(mPreview);
        addContentView(mDrawOnTop, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    }
}
