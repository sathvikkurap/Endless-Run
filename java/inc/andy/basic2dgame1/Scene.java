package inc.andy.basic2dgame1;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface Scene {
    void update();
    void draw(Canvas canvas);
    void terminate();
    void recieveTouch(MotionEvent event);
}
