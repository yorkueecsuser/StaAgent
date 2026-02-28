import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        do { // Mutation: Equivalent Loop Replacement
            width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
            height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        } while (false); // The condition is always false, but the loop will execute once due to the do-while loop structure
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}