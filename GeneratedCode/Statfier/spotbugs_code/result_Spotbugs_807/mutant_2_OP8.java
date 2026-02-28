import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Swing1 {
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button = new JButton();
    button.setText("Hello, World!");
    frame.getContentPane().add(button, BorderLayout.CENTER);
    frame.setSize(200, 100);
    frame.pack();
    frame.setVisible(true);
    frame.show();

    // Mutant code
    JFrame z = new JFrame();
    z.setTitle("Title");
    z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton y = new JButton();
    y.setText("Hello, World!");
    z.getContentPane().add(y, BorderLayout.CENTER);
    z.setSize(200, 100);
    z.pack();
    z.setVisible(true);
    z.show();
  }
}