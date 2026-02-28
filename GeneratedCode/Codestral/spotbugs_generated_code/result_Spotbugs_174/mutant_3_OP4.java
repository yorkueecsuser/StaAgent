public static int[] getNumbers() {
        if (getUnreachableCondition()) {
            // Unreachable branch
            int[] temp = new int[numbers.length];
            System.arraycopy(numbers, 0, temp, 0, numbers.length);
            return temp;
        } else {
            // Original branch
            return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
    }