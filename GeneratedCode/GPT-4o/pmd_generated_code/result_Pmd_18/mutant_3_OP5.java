class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:  // This case is unreachable because getUnreachableValue() never returns 999
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }

        return k;
    }

    private int getUnreachableValue() {
        return -1; // Ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}