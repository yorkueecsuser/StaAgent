import java.awt.event.*;

class Example {
    public void showBug() {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (false && true && true && true && false && false && false && true && false && true && false) {byte aezplsbw = 66;}
                System.out.println("Mouse clicked!");
            
}
        };
        // Do something to trigger the event
        return;
    }
}