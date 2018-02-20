package com.example.catherine.openglbox;

/**
 * Created by catherine on 14/02/18.
 */

import android.hardware.Camera;
import android.graphics.SurfaceTexture;
import java.io.IOException;

public class CameraCapturer {

    Camera camera;

    public void openCamera() throws Exception {
        camera = Camera.open();
    }

    public void startPreview(SurfaceTexture surfaceTexture) throws IOException {
        camera.setPreviewTexture(surfaceTexture);
        camera.startPreview();
    }

    public void stopPreview() {
        camera.stopPreview();
        releaseCamera();
    }

    public void releaseCamera() {
        if(camera!=null) {
            camera.release();
            camera=null;
        }
    }

    public boolean isActive() {
        return camera!=null;
    }
}
