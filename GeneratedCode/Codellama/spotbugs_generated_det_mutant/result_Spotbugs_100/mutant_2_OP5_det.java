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
        int zembvwss = 0;switch  (zembvwss) {case 1:long judentsi = 678354951;break;default:char ooyxogry = 'y';break;}
        // and the button is not clickable.
    
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Badly Overridden Adapter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BadlyOverriddenAdapter());
        frame.pack();
        frame.setVisible(true);
    }
}