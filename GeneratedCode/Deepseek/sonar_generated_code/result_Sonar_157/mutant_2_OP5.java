import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            moveWindowToTheBackground();
        }

        // Mutation 1: Unreachable Switch Statement
        int mutant1 = 3;
        switch(mutant1) {
            case 1: // unreachable code
                System.out.println("This is unreachable code");
                break;
            case 2:
                System.out.println("This is reachable code");
                break;
            default:
                break;
        }
    }

    private void openWindow() throws IOException {
        System.out.println("Opening Window");
    }

    private void closeWindow() throws IOException {
        System.out.println("Closing Window");
    }

    private void moveWindowToTheBackground() throws IOException {
        System.out.println("Moving Window to Background");
    }
}