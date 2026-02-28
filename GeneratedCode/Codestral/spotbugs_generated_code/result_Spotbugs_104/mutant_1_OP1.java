import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;
    int deadStore; // Mutant code: Dead Store

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        deadStore = 0; // Mutant code: Assigning a value to the dead store variable
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}