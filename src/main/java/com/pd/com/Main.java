package com.pd.com;

import java.awt.Frame;
import java.util.concurrent.TimeUnit;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-10-27 18:50
 * @Created by houhoudadi
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Frame f = com.pd.com.TankFrame.getInstance();

        while (true){
            TimeUnit.MILLISECONDS.sleep(50);
            f.repaint();
        }
    }
}
