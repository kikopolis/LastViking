package com.kikopolis.input;

import com.kikopolis.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInput implements MouseListener, MouseMotionListener {
    private final GamePanel gamePanel;
    
    public MouseInput(final GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        gamePanel.setRectPosition(e.getX(), e.getY());
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        gamePanel.setRectPosition(e.getX(), e.getY());
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
    
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
    
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
    
    }
}
