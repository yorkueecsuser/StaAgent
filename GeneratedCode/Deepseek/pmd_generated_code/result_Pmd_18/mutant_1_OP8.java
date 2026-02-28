class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int b = 010;    // set b with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * b;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }
}