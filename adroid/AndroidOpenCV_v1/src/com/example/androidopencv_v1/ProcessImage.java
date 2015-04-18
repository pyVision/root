package com.example.androidopencv_v1;

/* comptible
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//import android.util.Log;


import android.os.Environment;
import android.util.Log;


import java.util.StringTokenizer;


/**
 *
 * @author pi19404
 */



public class ProcessImage {
	public static String APPLICATION_DIR=Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android";    
        
    	static {
    		System.loadLibrary("opencv_core");
    		System.loadLibrary("opencv_imgproc");
    		System.loadLibrary("opencv_highgui");
    		System.loadLibrary("opencv_objdetect");
    		//System.loadLibrary("opencv_flann");
    		//
    		//System.loadLibrary("opencv_features2d");
    		//System.loadLibrary("opencv_contrib");    		
    		//System.loadLibrary("opencv_video");    		
    		//System.loadLibrary("opencv_legacy");
    		//System.loadLibrary("opencv_ml");
    		
    		//contrib features2d video  highgui legacy ml objdetect
    		System.loadLibrary("OpenVision_native");                 
    		}
   

        public ProcessImage() { 
        	//allocate();
        	Log.e("EEEE",""+APPLICATION_DIR+"/haarcascade_frontalface_alt.xml");
        	initDetector(APPLICATION_DIR+"/haarcascade_frontalface_alt.xml");
        }
       // private native void allocate();
        public native int run(int width, int height, byte yuv[], int[] rgba);
        public native void initDetector(String name);
            
}


