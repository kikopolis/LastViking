package com.kikopolis;

import com.kikopolis.input.KeyboardInput;
import com.kikopolis.input.MouseInput;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private int xDelta = 100;
    private int yDelta = 100;
    private int frames = 0;
    
    public GamePanel() {
        var mouseInput = new MouseInput(this);
        addKeyListener(new KeyboardInput(this));
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }
    
    public void addXDelta(int xDelta) {
        this.xDelta += xDelta;
        repaint();
    }
    
    public void addYDelta(int yDelta) {
        this.yDelta += yDelta;
        repaint();
    }
    
    public void setRectPosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }
    
    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(xDelta, yDelta, 100, 100);
    }
}
