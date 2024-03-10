import javax.swing.*;
public class Main {
    static JFrame frame = new JFrame("Pong");

    public static void main(String[] args) {

        // Exit on close button click
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set size of window, game will be rendered at 480x640
        // however the JFrame window will be slightly larger
        frame.setSize(650, 495);

        // Show window
        frame.setVisible(true);
    }
}
