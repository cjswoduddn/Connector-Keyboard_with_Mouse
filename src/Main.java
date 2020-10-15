import org.jnativehook.GlobalScreen;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        LogManager.getLogManager().reset();
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
        try{
            GlobalScreen.registerNativeHook();
        }catch (Exception e){

        }
        new GUI();
        GlobalScreen.addNativeKeyListener(new KeyEventer());
    }
}
