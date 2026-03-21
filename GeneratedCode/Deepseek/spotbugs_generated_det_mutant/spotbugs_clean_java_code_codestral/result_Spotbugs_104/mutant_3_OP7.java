import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public Boolean getFalseCondition() {
        return false;
    }

    public BadAppletConstructor() {
        width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        while(getFalseCondition()) {
            /* Unreachable while loop mutation added here */
        }

        height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}