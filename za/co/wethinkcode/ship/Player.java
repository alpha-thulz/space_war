package za.co.wethinkcode.ship;

import java.awt.*;

public class Player extends Rectangle implements Ship {
    private int x, y, WIDTH, HEIGHT;
    private double health;
    private final String name;
    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphic = (Graphics2D) graphics;

    }

    @Override
    public int getShipX() {
        return 0;
    }

    @Override
    public void setShipX(int x) {

    }

    @Override
    public int getShipY() {
        return 0;
    }

    @Override
    public void setShipY(int y) {

    }

    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public void setHealth() {

    }
}
