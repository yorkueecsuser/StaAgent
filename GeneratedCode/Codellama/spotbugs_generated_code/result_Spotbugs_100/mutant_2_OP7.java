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
        // Unreachable while loop mutant
        while (false) {
            // This code block is unreachable, as the loop condition is always false
            System.out.println("This code is unreachable.");
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