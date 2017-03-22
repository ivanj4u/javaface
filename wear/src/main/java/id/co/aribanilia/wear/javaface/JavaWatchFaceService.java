package id.co.aribanilia.wear.javaface;

import android.support.wearable.watchface.CanvasWatchFaceService;

/**
 * Created by ivan_j4u on 3/22/2017.
 */

public class JavaWatchFaceService extends CanvasWatchFaceService {

    @Override
    public Engine onCreateEngine() {
        return new JavaEngine();
    }

    private class JavaEngine extends Engine {

    }
}
