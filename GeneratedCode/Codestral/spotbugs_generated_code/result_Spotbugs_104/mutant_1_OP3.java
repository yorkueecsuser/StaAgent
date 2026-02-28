import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        if (isAppletStubInitialized()) { // Unreachable if statement
            width = getWidth();
            height = getHeight();
        }
    }

    // Method to check if AppletStub is initialized (always returns false)
    private boolean isAppletStubInitialized() {
        return false;
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}