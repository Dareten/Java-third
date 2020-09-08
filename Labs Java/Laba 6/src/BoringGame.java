import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BoringGame extends javax.swing.JFrame {
    JButton ok = new JButton("Ok");
    JTextField text = new JTextField(2);
    JDialog dialog = new JDialog();
    JPanel[] panels = new JPanel[2];
    JPanel[] panels2 = new JPanel[2];
    JButton quit = new JButton("Ok");
    JLabel label = new JLabel();
    static JFrame frame;
    int a = 3;
    private final Random random = new Random(System.currentTimeMillis());
    private final int x = Math.abs(random.nextInt() % 21);
    public BoringGame() {
        super("Lab 6");
        setSize(300,300);
        setLayout(new GridLayout(2, 1));
        for(int i=0;i<2;++i){
            panels[i] = new JPanel();
            add(panels[i]);
        }
        panels[0].setLayout(new GridBagLayout());
        panels[0].add(text);
        panels[1].setLayout(new GridBagLayout());
        panels[1].add(ok);
        dialog.setLayout(new GridLayout(2, 1));
        for(int i=0;i<2;++i){
            panels2[i] = new JPanel();
            dialog.add(panels2[i]);
        }
        panels2[0].setLayout(new GridBagLayout());
        panels2[0].add(label);
        panels2[1].setLayout(new GridBagLayout());
        panels2[1].add(quit);
        dialog.setSize(300, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setAutoRequestFocus(true);
        ok.addActionListener(ae -> {
            if(Integer.parseInt(text.getText()) == x) label.setText("Ого, получилось");
            else{
                if(--a > 0) label.setText(Integer.parseInt(text.getText()) > x ? "Попробуй еще разок, ответ вроде меньше" : "Попробуй еще разок, ответ побольше будет");
                else label.setText("Попробуешь удачу в другой раз");
            }
            dialog.setVisible(true);
        });
        quit.addActionListener(ae -> {
            dialog.setVisible(false);
            if(Integer.parseInt(text.getText()) == x || a == 0) System.exit(0);
        });
    }
    public static void main(String[]args) {
        frame = new BoringGame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
