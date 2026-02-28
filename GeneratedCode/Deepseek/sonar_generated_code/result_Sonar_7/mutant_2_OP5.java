class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        for (int i = 0; false; i++) { // Inserted unreachable switch statement
            int value = getValue();
            switch (value) {
                case 0:
                    // do nothing
                    break;
                case 1:
                    // do nothing
                    break;
                // and so on.
            }
        }
    }

    private int getValue() {
        return 0; // A non-final variable or an equivalent method call. This ensures that the switch condition does not result in true at all.
    }
}