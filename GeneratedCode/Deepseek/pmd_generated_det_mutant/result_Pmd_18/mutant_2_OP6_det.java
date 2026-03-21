class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        for  (int dsiqqfnn = 0; dsiqqfnn < 0; dsiqqfnn++) {double csprbkcd = 599849140;}
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    
}
}