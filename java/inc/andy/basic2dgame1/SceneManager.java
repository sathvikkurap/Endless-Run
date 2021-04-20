package inc.andy.basic2dgame1;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;

public class SceneManager {
    private ArrayList<Scene> scenes = new ArrayList<>();
    public static int ACTIVE_SCENE;

    public SceneManager(){
        ACTIVE_SCENE = 0;
        scenes.add(new GamePlayScene());
    }
    public void recieveTouch(MotionEvent event){
        scenes.get(ACTIVE_SCENE).recieveTouch(event);
    }
    public void update(){
        scenes.get(ACTIVE_SCENE).update();
    }
    public void draw(Canvas canvas){
        scenes.get(ACTIVE_SCENE).draw(canvas);
    }
}
