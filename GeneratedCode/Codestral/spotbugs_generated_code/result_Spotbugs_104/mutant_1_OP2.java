import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth(); // Original buggy line
        width = 100; // New line - constant value assignment
        height = getHeight(); // Original buggy line
        height = 100; // New line - constant value assignment
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}