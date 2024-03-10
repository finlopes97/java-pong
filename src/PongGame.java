import javax.swing.*;
import java.awt.*;

public class PongGame extends JPanel {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;

    /**
     * Updates and draws all graphics on screen
     */
    public void paintComponent(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}
