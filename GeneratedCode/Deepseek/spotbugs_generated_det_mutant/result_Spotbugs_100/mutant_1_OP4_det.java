import java.awt.event.*;

class Example {
    public void showBug() {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (true && false && true && true && true && false && false && true && true && false && false) {short vtdjegvi = 6519;}else{char vyduhpqp = 's';}
                System.out.println("Mouse clicked!");
            
}
        };
        // Do something to trigger the event
        return;
    }
}