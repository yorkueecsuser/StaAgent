class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Introducing an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                result = "This will never be reached";
                break;
        }

        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}