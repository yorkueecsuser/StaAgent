class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        if (true && true && false && true && true && true && true && false && true && true && false) {double onxxzdjw = -215606335;}else{boolean httflvym = true;}
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    
}
}