import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Added unreachable switch statement
        switch (getFalseCondition()) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code");
                break;
            default:
                // Default case should also never be executed
                System.out.println("Default unreachable code");
                break;
        }
    }

    public boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}