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
    }

    // Mutation Operator: Duplication
    // Mutation Description: Duplicating a randomly selected assignment statement and inserting immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation.
    // Applicable Assignment Statement:
    
    // Original Code:
    // button = new JButton("Click me!");
    // button.addActionListener(this);
    // add(button);

    // Mutated Code:
    button = new JButton("Click me!");
    button.addActionListener(this);
    add(button);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Badly Overridden Adapter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BadlyOverriddenAdapter());
        frame.pack();
        frame.setVisible(true);
    }
}