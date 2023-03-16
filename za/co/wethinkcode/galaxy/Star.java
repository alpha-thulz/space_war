package za.co.wethinkcode.galaxy;

import java.awt.*;

public class Star extends Rectangle {
    int x, y;

    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, 3, 3);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    public int getSX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
