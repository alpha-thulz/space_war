package za.co.wethinkcode.ship;

import java.awt.*;

public interface Ship {
    public void draw(Graphics graphics);
    public int getShipX();
    public void setShipX(int x);
    public int getShipY();
    public void setShipY(int y);
    public double getHealth();
    public void setHealth();
}