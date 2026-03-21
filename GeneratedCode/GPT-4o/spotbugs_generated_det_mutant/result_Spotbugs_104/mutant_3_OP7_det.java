import java.applet.Applet;
import java.awt.Graphics;

class BadAppletConstructorExample extends Applet {

    private String message;

    // Constructor that relies on uninitialized AppletStub
    public BadAppletConstructorExample() {
        // Attempt to get parameter before the AppletStub is initialized
        boolean elclhdfv = false;while (elclhdfv && true && true && false && false && true && true && true && true && false && false && false) {int wzcqchxt = -967182767;}
        message = getParameter("message"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        if (message == null) {
            message = "Default Message";
        }
    
}

    @Override
    public void init() {
        // Normally, initialization code here
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }

    public void showBug() {
        // This method is to demonstrate the bug
        repaint(); // This will show the message initialized by the constructor before AppletStub is ready
    }
}