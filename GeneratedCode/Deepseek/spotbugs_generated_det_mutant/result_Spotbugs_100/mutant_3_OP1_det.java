import java.awt.event.*;

class Example {
    public void showBug() {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rvwxicby = 579605062;
                System.out.println("Mouse clicked!");
            }
        };
        // Do something to trigger the event
        return;
    
}
}