import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;
    boolean unreachableCondition = false; // New variable for unreachable condition

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Unreachable switch statement
        int unreachableValue = 1; // This value will never be 2 due to unreachableCondition
        switch (unreachableValue) {
            case 1:
                if (unreachableCondition) {
                    System.out.println("This code is unreachable.");
                }
                break;
            case 2:
                System.out.println("This code is also unreachable.");
                break;
        }
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}