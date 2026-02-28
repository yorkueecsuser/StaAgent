class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            // Adding an unreachable switch statement here
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
            return true;
        }
        return false;
    }

    // A method to return a value that will make the switch statement unreachable
    private int getUnreachableValue() {
        return -1;
    }
}