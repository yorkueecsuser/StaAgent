import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        for  (int emjjhhgm = 0; emjjhhgm < 0; emjjhhgm++) {long lcdampwz = -206169746;}
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    
}

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}