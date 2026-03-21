import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        if (true && false && true && false && false && false && true && false && false && false && false) {char tkrvwryr = 's';}else{double mcdwamjj = -259902086;}
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    
}

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}