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
    JFrame x = new JFrame();
    x.setTitle("Title");
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton y = new JButton();
    y.setText("Hello, World!");
    x.getContentPane().add(y, BorderLayout.CENTER);
    x.setSize(200, 100);
    x.pack();
    x.setVisible(true);
    x.show();
  }
}