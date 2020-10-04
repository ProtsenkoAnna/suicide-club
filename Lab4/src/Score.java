import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame {
    private JLabel result = new JLabel();
    private JLabel lastScorer = new JLabel();
    private JLabel winner = new JLabel();
    private JButton milan = new JButton("AC MILAN");
    private JButton madrid = new JButton("REAL MADRID");
    int resultMilan, resultMadrid;

    public Score() {
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        setContentPane(contentPanel);

        Box mainBox = Box.createVerticalBox();
        add(mainBox);

        mainBox.add(result);
        mainBox.add(Box.createVerticalStrut(20));
        Box box = Box.createHorizontalBox();
        mainBox.add(box);
        mainBox.add(Box.createVerticalStrut(20));
        box.add(lastScorer);
        box.add(Box.createHorizontalStrut(20));
        box.add(winner);
        box = Box.createHorizontalBox();
        mainBox.add(box);
        box.add(milan);
        box.add(Box.createHorizontalStrut(20));
        box.add(madrid);

        result.setAlignmentX(CENTER_ALIGNMENT);
        result.setBackground(Color.CYAN);
        result.setOpaque(true);
        result.setFont(new Font (result.getFont().getName(), Font.BOLD, 20));

        fixSize(200, 30, lastScorer);
        fixSize(200, 30, winner);
        lastScorer.setHorizontalAlignment(SwingConstants.RIGHT);

        fixSize(140, 30, milan);
        fixSize(140, 30, madrid);


        milan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultMilan++;
                showScore();
                showLast("AC MILAN");
            }
        });
        madrid.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultMadrid++;
                showScore();
                showLast("REAL MADRID");
            }
        });

        showScore();
        showLast("-");
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void showLast(String scorer) {
        lastScorer.setText("Last Scorer: " + scorer);
    }

    private void showScore() {
        result.setText("Result: " + resultMilan + "  X  " + resultMadrid);
        if (resultMadrid > resultMilan)
            winner.setText("Winner: REAL MADRID");
        else if (resultMilan > resultMadrid)
            winner.setText("Winner: AC MILAN");
        else
            winner.setText("Winner: DRAW");
    }

    private void fixSize(int width, int height, Component comp) {
        Dimension dim = new Dimension(width, height);
        comp.setMaximumSize(dim);
        comp.setMinimumSize(dim);
        comp.setPreferredSize(dim);
    }

    public static void main(String[] args) {
        new Score().setVisible(true);
    }
}

