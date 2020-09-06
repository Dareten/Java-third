import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class AndAnotherOne {
    public static void main(String[] args) {
        new AndAnotherOne(args[0]);
    }

    public AndAnotherOne(final String filename) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Lab 5");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JLabel jLabel = new JLabel();
            try {
                jLabel.setIcon(new ImageIcon(ImageIO.read(new File(filename))));
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
            frame.getContentPane().add(jLabel, BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}