class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }
    
    // Mutant Code
    public int showBugMutant() {
        int a = 012;    // set a with 10 not 12. 'i' has been renamed to 'a'
        int j = 010;    // set j with 8 not 10
        int b = a * j;  // set b with 80 not 120. 'k' has been renamed to 'b'
        return b;
    }
}