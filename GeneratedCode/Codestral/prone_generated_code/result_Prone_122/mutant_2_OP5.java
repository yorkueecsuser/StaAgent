class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // Introduce unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                // This block will never be executed as value is never 1
                Integer y = null;
                System.out.println(y.toString());
                break;
            default:
                // Default block is reachable
                break;
        }

        return x;
    }

    // Method to determine the value
    private int getValue() {
        // For example, assume the value is always 2
        return 2;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}