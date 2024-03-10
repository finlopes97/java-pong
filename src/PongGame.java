import javax.swing.*;
import java.awt.*;

public class PongGame extends JPanel {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    private Ball gameBall = new Ball(300, 200, 3, 3, 3, 10, Color.YELLOW);

    /**
     * Updates and draws all graphics on screen
     */
    public void paintComponent(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        gameBall.paint(graphics);
    }

}
