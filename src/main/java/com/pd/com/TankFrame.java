package com.pd.com;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Classname TankFrame
 * @Description TODO
 * @Date 2020-10-27 18:46
 * @Created by houhoudadi
 */
public class TankFrame extends Frame {

    public final String TITLE = "TANK WAR";
    public final int WIDTH = 800;
    public final int HEIGHT = 600;

    public int x ,y = 100;

    private TankFrame(){
        setVisible(true);
        setTitle(TITLE);
        setSize(WIDTH,HEIGHT);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        addKeyListener(new TankKeyListener());
    }

    private static class TankFrameHolder{
        private static final TankFrame INSTANCE = new TankFrame();
    }

    public static TankFrame getInstance() {
        return TankFrameHolder.INSTANCE;
    }

    @Override
    public void paint(Graphics g) {
        //System.out.println("paint...");
        g.fillRect(x,y,20,20);
    }

    class TankKeyListener extends KeyAdapter {

        boolean BU = false;
        boolean BD = false;
        boolean BL = false;
        boolean BR = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_UP:
                    BU = true;
                    break;
                case KeyEvent.VK_DOWN :
                    BD = true;
                    break;
                case KeyEvent.VK_LEFT :
                    BL = true;
                    break;
                case KeyEvent.VK_RIGHT :
                    BR = true;
                    break;
                default:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_UP:
                    BU = false;
                    break;
                case KeyEvent.VK_DOWN :
                    BD = false;
                    break;
                case KeyEvent.VK_LEFT :
                    BL = false;
                    break;
                case KeyEvent.VK_RIGHT :
                    BR = false;
                    break;
                default:
                    break;
            }
        }
    }
}
