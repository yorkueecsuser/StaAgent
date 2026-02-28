class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            // Unreachable switch statement
            int value = getFalseValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
            arr[i] = i;
        }
        return arr;
    }

    private boolean getFalseValue() {
        return false;
    }
}