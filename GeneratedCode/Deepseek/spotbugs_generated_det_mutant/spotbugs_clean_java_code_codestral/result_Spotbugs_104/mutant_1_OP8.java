import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int w; // Renamed from 'width'
    int h; // Renamed from 'height'

    public BadAppletConstructor() {
        w = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        h = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }

    public void showBug() {
        System.out.println("Width: " + w + ", Height: " + h); // Updated variable names
    }
}