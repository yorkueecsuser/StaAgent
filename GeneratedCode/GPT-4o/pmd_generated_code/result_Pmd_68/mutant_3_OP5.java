class ReturnFromFinallyExample {

    public String showBug() {
        return foo();
    }

    public String foo() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Unreachable switch statement mutation
            int unreachableSwitchVariable = getUnreachableValue(); // Non-final variable
            switch (unreachableSwitchVariable) {
                case 1:
                    System.out.println("This is unreachable case 1");
                    break;
                case 2:
                    System.out.println("This is unreachable case 2");
                    break;
                default:
                    System.out.println("This is unreachable default case");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private int getUnreachableValue() {
        return 3; // This makes the switch cases unreachable
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}