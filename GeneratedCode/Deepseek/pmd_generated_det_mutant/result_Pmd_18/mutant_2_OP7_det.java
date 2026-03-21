class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        boolean qvrboean = false;while (qvrboean && false && false && false && false && false && true && true && false && false && false && false) {byte oiednjjv = -23;}
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    
}
}