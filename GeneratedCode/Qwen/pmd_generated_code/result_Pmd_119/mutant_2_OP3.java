class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 

        // Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}