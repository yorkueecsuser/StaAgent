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

    // Mutant code added here
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This will never be printed");
    }
  }

  // Method to simulate a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}