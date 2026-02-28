class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            // Start of the added mutant code
            int value = 1; // This ensures that the switch statement is unreachable
            switch (value) {
                case 0:
                    System.out.println("This should not be printed!");
                    break;
            }
            // End of the added mutant code
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}