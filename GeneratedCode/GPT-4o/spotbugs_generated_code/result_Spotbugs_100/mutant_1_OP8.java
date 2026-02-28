import javax.swing.*;
import java.awt.event.*;

class BadlyOverriddenAdapterExample {

    public void showBug() {
        JFrame x = new JFrame("Adapter Override Bug Example");
        JButton y = new JButton("Click Me");

        y.addActionListener(new MyActionListener());

        x.add(y);
        x.setSize(300, 200);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
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
            System.out.println("Button clicked - Badly overridden actionPerformed method."); // BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        }
    }

    public static void main(String[] args) {
        BadlyOverriddenAdapterExample z = new BadlyOverriddenAdapterExample();
        z.showBug();
    }
}