import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BadlyOverriddenAdapter extends JPanel implements ActionListener {
    private JButton button;

    public BadlyOverriddenAdapter() {
        button = new JButton("Click me!");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
        // BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        // Explanation: The actionPerformed method in this class overrides the method with the same signature in the superclass Adapter,
        // but the implementation is wrong because it does not call the superclass method. As a result, the button click event is not registered
        // and the button is not clickable.

        // MUTATION OPERATOR: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

        // Note: This mutation operator aims to insert an unreachable for loop into the actionPerformed method.
        // The for loop will be inserted after the println statement.

        // Original code:
        // System.out.println("Button clicked!");

        // Mutated code:
        for (int i = 0; false; i++) {
            // This for loop will never be executed because the condition is always false.
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Badly Overridden Adapter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BadlyOverriddenAdapter());
        frame.pack();
        frame.setVisible(true);
    }
}