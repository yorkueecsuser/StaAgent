class AvoidUsingOctalValuesBug {
    private int getValue() {
        return -1;  // This value is not present in the switch cases
    }

    public int showBug() {
        int i = 012;
        int j = 010;

        int value = getValue();
        switch(value) {  // Unreachable switch statement
            case 0:
                System.out.println("This case will never be reached");
                break;
            default:
                break;
        }

        return i * j;
    }
}