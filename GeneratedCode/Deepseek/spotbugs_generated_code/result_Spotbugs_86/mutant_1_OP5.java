class BitwiseBug {
    public boolean showBug(int number) {
        // Original buggy code
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // Mutated code - Unreachable switch statement
        boolean shouldSwitch = false;
        switch (number) {
            case 1:
                if (shouldSwitch) {
                    System.out.println("This line is unreachable due to the switch condition");
                }
                break;
        }
    }
}