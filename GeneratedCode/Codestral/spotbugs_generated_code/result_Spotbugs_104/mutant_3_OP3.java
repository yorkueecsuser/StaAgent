import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth();
        height = getHeight();

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}