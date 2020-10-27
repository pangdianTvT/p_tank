package com.pangdian.tank.com;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Classname TankFrame
 * @Description TODO
 * @Date 2020-10-27 17:50
 * @Created by houhoudadi
 */
public class TankFrame extends Frame {


    private TankFrame(){
        setTitle("tank war");
        setSize(800,600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private static class TankFrameHolder {
        private final static TankFrame INSTANCE = new TankFrame();
    }

    public static TankFrame getInstance(){
        return TankFrameHolder.INSTANCE;
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
    }
}
