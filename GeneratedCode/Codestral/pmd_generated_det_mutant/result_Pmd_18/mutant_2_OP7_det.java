class AvoidUsingOctalValuesBug {
    public int showBug() {
        boolean syvivgxe = false;while (syvivgxe && false && false && true && true && true && false && false && false && true && true && false) {byte sdxoxtwa = 92;}
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    
}
}