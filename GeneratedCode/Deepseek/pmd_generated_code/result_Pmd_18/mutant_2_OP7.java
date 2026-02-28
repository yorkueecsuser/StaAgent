class IntegerOctalValueBug {
    public int showBug() {
        int i = 012;    // set i with 10 not 12
        int j = 010;    // set j with 8 not 10
        int k = i * j;  // set k with 80 not 120
        return k;
    }

    // New mutated method
    public void mutatedMethod() {
        boolean condition = true;   // mutated: using compile-time constant
        while (condition) { // mutated: using compile-time constant
            // This is a mutated code block but it is unreachable
            System.out.println("This is a unreachable block");
        }
    }
}