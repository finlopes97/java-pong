import java.awt.*;

public class Ball {
    private int x, y, cx, cy, speed, size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, int size, Color color) {
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.size = size;
        this.color = color;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
    }

    public void moveBall() {
        x += cx;
        y += cy;
    }
}
