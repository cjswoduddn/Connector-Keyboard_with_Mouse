import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;
import java.awt.event.InputEvent;

public class KeyEventer implements NativeKeyListener {
    Robot robot;
    boolean backquote = false;

    KeyEventer(){
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_BACKQUOTE){
            backquote = true;
        }else if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_O){
            if(backquote) {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
        }else if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_H){
            if(backquote){
                Point cur = MouseInfo.getPointerInfo().getLocation();
                robot.mouseMove(cur.x-20, cur.y);
            }
        }else if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_J){
            if(backquote){
                Point cur = MouseInfo.getPointerInfo().getLocation();
                robot.mouseMove(cur.x, cur.y+20);
            }
        }else if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_K){
            if(backquote) {
                Point cur = MouseInfo.getPointerInfo().getLocation();
                robot.mouseMove(cur.x, cur.y - 20);
            }
        }else if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_L) {
            if (backquote) {
                Point cur = MouseInfo.getPointerInfo().getLocation();
                robot.mouseMove(cur.x + 20, cur.y);
            }
        }
    }
    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {
        if(nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_BACKQUOTE){
            backquote = false;
        }
    }
}
