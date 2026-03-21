class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int qlisarvt = 0;switch  (qlisarvt) {case 1:byte ujwvycpv = 45;break;default:double xqwpxdsf = -219798896;break;}
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    
}
}