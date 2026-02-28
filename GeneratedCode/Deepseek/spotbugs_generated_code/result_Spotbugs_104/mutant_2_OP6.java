import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    // Non-final method to generate false condition
    private boolean getFalseCondition() {
        return false;
    }

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Unreachable for loop mutation
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This line should never print.");
        }
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}