import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;
    boolean unreachableCondition = false;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Mutant: Unreachable if-else statement
        if (unreachableCondition) {
            System.out.println("This branch will never be executed.");
        } else {
            System.out.println("This is the unreachable branch.");
        }
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    // Helper method to avoid using constant false
    private boolean getCondition() {
        return false;
    }
}