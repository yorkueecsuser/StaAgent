import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Inserted unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This line will never be printed.");
        }
    }

    private boolean getUnreachableCondition() {
        // Dynamically determine the condition at runtime
        // Always return false to make the loop unreachable
        return false;
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}