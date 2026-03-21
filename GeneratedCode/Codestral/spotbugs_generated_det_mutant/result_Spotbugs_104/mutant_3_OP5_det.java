import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        int ktexcviz = 0;switch  (ktexcviz) {case 1:short ouuelaaf = -9243;break;default:char ipgvqbtl = 'c';break;}
        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    
}

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}