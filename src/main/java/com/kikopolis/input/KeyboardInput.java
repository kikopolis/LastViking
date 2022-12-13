package com.kikopolis.input;

import com.kikopolis.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
    private final GamePanel gamePanel;
    
    public KeyboardInput(final GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.addYDelta(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.addYDelta(5);
                break;
            case KeyEvent.VK_A:
                gamePanel.addXDelta(-5);
                break;
            case KeyEvent.VK_D:
                gamePanel.addXDelta(5);
                break;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}
