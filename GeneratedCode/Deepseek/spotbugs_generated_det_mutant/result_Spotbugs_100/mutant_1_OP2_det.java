import java.awt.event.*;

class Example {
public void showBug() {
    MouseAdapter adapter = new MouseAdapter() { @ Override public void mouseClicked(MouseEvent e){ System.out.println("Mouse clicked!"); } };
    adapter = new MouseAdapter() { @ Override public void mouseClicked(MouseEvent e){ System.out.println("Mouse clicked!"); } };
    return;
}
}