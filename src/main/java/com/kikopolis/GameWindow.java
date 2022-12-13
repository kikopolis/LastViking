package com.kikopolis;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GameWindow {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private final JFrame gameFrame;
    
    public GameWindow(final GamePanel gamePanel) {
        gameFrame = new JFrame("Last Viking");
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setSize(WIDTH, HEIGHT);
    
        gameFrame.add(gamePanel);
    
//        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }
}
