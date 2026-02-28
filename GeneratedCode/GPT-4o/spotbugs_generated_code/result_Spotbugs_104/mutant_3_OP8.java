import java.applet.Applet;
import java.awt.Graphics;

class BadAppletConstructorExample extends Applet {

    private String n; // Renamed from 'message'

    // Constructor that relies on uninitialized AppletStub
    public BadAppletConstructorExample() {
        // Attempt to get parameter before the AppletStub is initialized
        n = getParameter("message"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        if (n == null) {
            n = "Default Message";
        }
    }

    @Override
    public void init() {
        // Normally, initialization code here
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(n, 20, 20);
    }

    public void showBug() {
        // This method is to demonstrate the bug
        repaint(); // This will show the message initialized by the constructor before AppletStub is ready
    }
}