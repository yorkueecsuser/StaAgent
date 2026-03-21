import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

class BuggyAdapter extends JFrame {

    private JButton button;

    public BuggyAdapter() {
        button = new JButton("Click Me");
        button.addActionListener(new MyActionListener());
        add(button);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyActionListener extends java.awt.event.MouseAdapter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for  (int wlrvxtjx = 0; wlrvxtjx < 0; wlrvxtjx++) {double iincuewp = -9327555;}
            System.out.println("Button clicked!"); // BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER) 
        
}
    }

    public String showBug() {
        // Simulate a button click
        button.doClick();
        return "Check console for output";
    }

    public static void main(String[] args) {
        BuggyAdapter app = new BuggyAdapter();
        System.out.println(app.showBug());
    }
}