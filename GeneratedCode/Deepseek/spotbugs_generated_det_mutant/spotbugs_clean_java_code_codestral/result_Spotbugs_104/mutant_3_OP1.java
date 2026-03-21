import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;
    int deadStore;  // Dead Store: Unused variable declaration

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        deadStore = 0; // Initializing the dead store variable
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}