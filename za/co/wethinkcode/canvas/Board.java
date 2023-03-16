package za.co.wethinkcode.canvas;


import za.co.wethinkcode.galaxy.Star;
import za.co.wethinkcode.ship.Ship;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;

public class Board extends JPanel {
    private Random random = new Random();
    private List<Star> stars;
    private Ship ship;

    public Board(Ship ship, List<Star> stars) {
        this.stars = stars;
        this.ship = ship;
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D pen = (Graphics2D) g;
        RenderingHints rendering = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        pen.setRenderingHints(rendering);
        pen.fillRect(0,0, getWidth(), getHeight());
        for (Star star : stars) {
            int x = star.getSX();
            x -= 3;
            if (x < 0) {
                x += getWidth();
            }
            star.setX(x);
            star.draw(g);
        }
        ship.draw(g);
    }
}