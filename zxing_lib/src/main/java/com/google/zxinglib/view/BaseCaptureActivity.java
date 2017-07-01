package com.google.zxinglib.view;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.google.zxinglib.camera.CameraManager;
import com.google.zxinglib.decoding.CaptureActivityHandler;

/**
*
*<br>BaseCaptureActivity.java</br>
* @author Angus
* @time 2014-6-9  上午11:50:53
*/
public abstract class BaseCaptureActivity extends Activity {

	/** 相机管理类 */
	private CameraManager cameraManager;
	/** 扫描结果通知类 */
	private CaptureActivityHandler handler;
	/** 扫描view */
	private ViewfinderView viewfinderView;

	/**
	 * A valid barcode has been found, so give an indication of success and show
	 * the results.
	 * 
	 * @param rawResult
	 *            The contents of the barcode.
	 */
	public void handleDecode(Result rawResult, Bitmap barcode) {

	}


	public void drawViewfinder() {
		viewfinderView.drawViewfinder();
	}

	public ViewfinderView getViewfinderView() {
		return viewfinderView;
	}

	public Handler getHandler() {
		return handler;
	}

	public CameraManager getCameraManager() {
		return cameraManager;
	}



}
