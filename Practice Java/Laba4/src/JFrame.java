import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class JFrame extends javax.swing.JFrame {
    JButton milan = new JButton("AC Milan");
    JButton real = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    JPanel[] panels = new JPanel[9];

    private int r = 0, m = 0;
    public JFrame() {
        super("Practice 4");
        setSize(400,400);
        setLayout(new GridLayout(3, 3));
        for(int i=0;i<9;++i){
            panels[i] = new JPanel();
            add(panels[i]);
        }
        panels[1].setLayout(new GridBagLayout());
        panels[1].add(winner);
        panels[3].setLayout(new GridBagLayout());
        panels[3].add(lastScorer);
        panels[5].setLayout(new GridBagLayout());
        panels[5].add(result);
        panels[6].setLayout(new GridBagLayout());
        panels[6].add(milan);
        panels[8].setLayout(new GridBagLayout());
        panels[8].add(real);

        milan.addActionListener(ae -> {
            lastScorer.setText("Last scorer: AC Milan");
            ++m;
            setWinnerAndResult();
        });
        real.addActionListener(ae -> {
            lastScorer.setText("Last scorer: Real Madrid");
            ++r;
            setWinnerAndResult();
        });
    }
    public static void main(String[]args)
    {
        new JFrame().setVisible(true);
    }
    public void setWinnerAndResult(){
        if(m > r){
            winner.setText("Winner: AC Milan");
        }else if(m < r){
            winner.setText("Winner: Real Madrid");
        }else{
            winner.setText("Winner: DRAW");
        }
        result.setText("Result: " + m + " X " + r);
    }
}
