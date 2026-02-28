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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}