class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2;
        }

        // Mutated code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        // This method ensures that the switch condition always evaluates to false, making the switch statement unreachable
        return -1;
    }
}