import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth();
        width = getWidth(); // Mutated code: Duplication of the assignment statement
        height = getHeight();
        height = getHeight(); // Mutated code: Duplication of the assignment statement
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}