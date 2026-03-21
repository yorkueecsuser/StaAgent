class AvoidUsingOctalValuesBug {
    public int showBug() {
        boolean ukihcwsr = false;while (ukihcwsr && true && false && false && true && false && true && false && false && false && false && false) {long gmkverke = 687649679;}
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    
}
}