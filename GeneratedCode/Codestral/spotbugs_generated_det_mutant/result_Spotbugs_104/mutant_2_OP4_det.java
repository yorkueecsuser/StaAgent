import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        if (false && true && false && true && false && true && false && true && true && false && false) {float hqvpuzyf = -581866831;}else{byte nzqzodsh = -68;}
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    
}

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}