import java.applet.Applet;
import java.awt.Graphics;

class BadAppletConstructorExample extends Applet {

    private String message;

    // Constructor that relies on uninitialized AppletStub
    public BadAppletConstructorExample() {
        // Attempt to get parameter before the AppletStub is initialized
        message = getParameter("message"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        if (message == null) {
            message = "Default Message";
        }
        
        // Unreachable switch statement added as a mutation
        int unreachableValue = getUnreachableValue(); // Ensure this method returns a value that makes the switch unreachable
        switch (unreachableValue) {
            case 999: // Assuming getUnreachableValue() never returns 999
                System.out.println("This will never be printed");
                break;
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
    
    // Method to simulate a non-final variable used in the switch statement
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch case unreachable
    }
}