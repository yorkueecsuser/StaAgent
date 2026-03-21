import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public void printDimensions() {
        do {
            BadAppletConstructor badApplet = new BadAppletConstructor();
            badApplet.showBug();
        } while (false); // This do-while loop acts as an equivalent replacement for any non-loop construct in the original code.
    }
}