class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }
}

class UnreachableWhileLoopMutant {
    // MUTANT: UnreachableWhileLoop
    public void showMutant() {
        boolean condition = false;
        while (condition) {
            System.out.println("This is a mutant");
            condition = true; // This line ensures that the loop is unreachable
        }
    }
}