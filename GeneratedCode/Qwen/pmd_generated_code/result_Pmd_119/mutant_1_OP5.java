class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 

        // Introduced Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will also not be reached due to the same reason
                System.out.println("This is also an unreachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}