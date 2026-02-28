import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth();
        height = getHeight();

        // Mutant Code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never execute.");
        } else {
            // This block is also unreachable as the condition is always false
            width = 0;
            height = 0;
        }
    }

    // A placeholder method to simulate a dynamically determined condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}