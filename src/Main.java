import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame frame = new JFrame("Pong");

    public static void main(String[] args) {

        // Exit on close button click
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set size of window, game will be rendered at 480x640
        // however the JFrame window will be slightly larger
        frame.setSize(650, 495);

        // Make the new PongGame
        PongGame game = new PongGame();

        // Add the game to the window
        frame.add(game);

        // Show window
        frame.setVisible(true);

        // Make a new timer
        Timer timer = new Timer(33, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.repaint();
            }
        });

        // Start timer after creation
        timer.start();
    }
}
