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

        // Insert an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 100: // This case will never be executed
                System.out.println("This will never be printed.");
                break;
            default:
                // Do nothing
        }
    }

    private int getUnreachableValue() {
        return -1; // This ensures the switch statement is unreachable as it doesn't match any case
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
        BadlyOverriddenAdapterExample example = new BadlyOverriddenAdapterExample();
        example.showBug();
    }
}