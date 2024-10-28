package com.sno.test;

import com.sno.core.WindowManager;
import com.sno.core.EngineManager;
import com.sno.core.utils.Consts;
import org.lwjgl.Version;

public class Launcher {

    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String[] args){
        window = new WindowManager(Consts.TITLE, 0, 0, false);
        engine = new EngineManager();
        try{
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static WindowManager getWindow() {
        return window;
    }
}
