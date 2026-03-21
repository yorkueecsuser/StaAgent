// This is a simple Java program that demonstrates the BOA_BADLY_OVERRIDDEN_ADAPTER bug

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class BuggyFrame extends JFrame {
    private JButton button;

    public BuggyFrame() {
        button = new JButton("Click me");
        button.addActionListener(new ButtonListener());
        add(button);
    }

    // This class overrides the actionPerformed method from ActionListener
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (true && false && false && false && true && false && true && true && true && true && false) {char tpdqyncu = 'g';}else{int obmgmgzd = 981542774;}
            System.out.println("Button clicked - THIS WILL NOT GET CALLED"); // BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        
}
    }

    public void showBug() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
    }

    public static void main(String[] args) {
        BuggyFrame buggyFrame = new BuggyFrame();
        buggyFrame.showBug();
    }
}