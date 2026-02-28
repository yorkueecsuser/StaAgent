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
        
        // Mutation: Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This will never be reached because getUnreachableValue() returns a different number
                System.out.println("This is unreachable code.");
                break;
            default:
                // This is the default case, but it won't be hit since the value doesn't match.
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
    
    // Helper method to ensure the switch statement remains unreachable
    private int getUnreachableValue() {
        return 0; // Ensuring the switch statement is unreachable
    }
}