import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        final boolean alwaysFalse = false;
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
            }
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    if (alwaysFalse) {
                        System.out.println("This code will never be executed.");
                    }
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        return -1;
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}