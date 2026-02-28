class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }

    // Mutation 1: replace 012 with 10
    public int showMutant1() {
        int i = 10;     // set i with 10 not 12 
        int j = 010;    // set j with 8 not 10 
        int k = i * j;  // set k with 80 not 120 
        return k;
    }

    // Mutation 2: replace 010 with 8
    public int showMutant2() {
        int i = 012;    // set i with 10 not 12 
        int j = 8;      // set j with 8 not 10 
        int k = i * j;  // set k with 80 not 120 
        return k;
    }

    // Mutation 3: replace 012 and 010 with 10 and 8 respectively
    public int showMutant3() {
        int i = 10;     // set i with 10 not 12 
        int j = 8;      // set j with 8 not 10 
        int k = i * j;  // set k with 80 not 120 
        return k;
    }
}