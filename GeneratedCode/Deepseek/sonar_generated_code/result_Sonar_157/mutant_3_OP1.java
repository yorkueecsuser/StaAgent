import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { 
            moveWindowToTheBackground();
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

class MutantCode extends NonCompliantCode {
    private String mutationVar;

    MutantCode() {
        super();
        mutationVar = "abcdefgh"; //randomly generated string of 
    }

    @Override
    public void showBug(int param) throws IOException {
        super.showBug(param);
        if (mutationVar.equals("abcdefgh")) {
            System.out.println("This is a mutant line");
        }
    }
}