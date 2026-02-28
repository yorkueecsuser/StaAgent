import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Mutant code: Unreachable switch statement
        int unreachableValue = 1;
        switch (unreachableValue) {
            case 2: // This case is unreachable because unreachableValue is always 1
                System.out.println("This is an unreachable statement.");
                break;
        }
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}