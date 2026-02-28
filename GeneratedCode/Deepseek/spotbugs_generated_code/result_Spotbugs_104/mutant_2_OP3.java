import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        // Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This will never be printed");
        }

        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the if statement unreachable
        return false;
    }
}