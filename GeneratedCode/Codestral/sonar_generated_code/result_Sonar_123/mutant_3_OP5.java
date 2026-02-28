class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;

            // New unreachable switch statement
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This line should never execute");
                    break;
            }

            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }

    private int getValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }
}