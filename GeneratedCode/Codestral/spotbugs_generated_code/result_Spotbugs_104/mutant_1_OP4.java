import java.applet.Applet;

class BadAppletConstructor extends Applet {

    int width;
    int height;

    public BadAppletConstructor() {
        width = getWidth();
        height = getHeight();

        // Unreachable if-else statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is unreachable
            int x = 10;
            x += 5;
        } else {
            // This block is reachable, but it's empty as per the mutation operator's description
        }
    }

    public void showBug() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    // Method to determine the unreachable condition
    private boolean isUnreachable() {
        // This method always returns false to make the condition unreachable
        return false;
    }
}