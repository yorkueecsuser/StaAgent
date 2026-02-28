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
    button.setText("Hello, World!"); // Mutant: duplicated assignment statement
    frame.getContentPane().add(button, BorderLayout.CENTER);
    frame.setSize(200, 100);
    frame.setSize(200, 100); // Mutant: duplicated assignment statement
    frame.pack();
    frame.setVisible(true);
    frame.show();
  }
}