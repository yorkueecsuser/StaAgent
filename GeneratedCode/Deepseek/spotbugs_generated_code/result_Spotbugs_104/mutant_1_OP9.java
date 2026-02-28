import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        int i = 0;
        do {
            width = getWidth(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
            height = getHeight(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
            i++;
        } while (i < 1); // The loop will execute only once due to the condition i < 1
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}