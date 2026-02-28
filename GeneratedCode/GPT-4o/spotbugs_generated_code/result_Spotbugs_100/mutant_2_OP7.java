import javax.swing.*;
import java.awt.event.*;

class BadlyOverriddenAdapterExample {

    public void showBug() {
        JFrame frame = new JFrame("Adapter Override Bug Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new MyActionListener());

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Adding unreachable while loop mutation
        boolean conditionWhile = determineCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed because the condition is false.");
        }
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

    // Method to provide a runtime condition for the unreachable loop
    private boolean determineCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        BadlyOverriddenAdapterExample example = new BadlyOverriddenAdapterExample();
        example.showBug();
    }
}