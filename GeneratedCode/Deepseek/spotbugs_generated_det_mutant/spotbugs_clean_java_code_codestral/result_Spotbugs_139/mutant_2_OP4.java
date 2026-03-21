class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString();
        boolean shouldRun = getCondition(); // Mutation: Inserted unreachable branch
        if (shouldRun) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("Unreachable code");
        }
        else {
            // This is the actual code path
            System.out.println("Reachable code");
        }
        return input;
    }

    public boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Reachable code" and "Hello World"
    }
}