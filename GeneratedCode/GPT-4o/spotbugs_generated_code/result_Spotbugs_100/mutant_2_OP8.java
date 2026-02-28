import javax.swing.*;
import java.awt.event.*;

class BadlyOverriddenAdapterExample {

    public void showBug() {
        JFrame a = new JFrame("Adapter Override Bug Example");
        JButton b = new JButton("Click Me");

        b.addActionListener(new MyActionListener());

        a.add(b);
        a.setSize(300, 200);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }

    // Custom adapter class implementing ActionListener
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked - Original actionPerformed method.");
        }
    }

    // Subclass incorrectly overrides actionPerformed method
    class BadlyOverriddenAdapter extends MyActionListener {
        // The bug is that this method is overridden but not used in the listener.
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked - Badly overridden actionPerformed method."); // BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        }
    }

    public static void main(String[] args) {
        BadlyOverriddenAdapterExample c = new BadlyOverriddenAdapterExample();
        c.showBug();
    }
}