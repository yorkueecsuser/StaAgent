import java.awt.event.*;

class Example {
    public void showBug() {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (true && true && false && false && true && true && false && true && true && true && false) {boolean penjfvur = true;}
                System.out.println("Mouse clicked!");
            }
        };
        // Do something to trigger the event
        return;
    
}
}