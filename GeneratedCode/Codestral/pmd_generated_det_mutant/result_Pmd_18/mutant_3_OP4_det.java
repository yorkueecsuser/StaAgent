class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        if (false && true && false && false && true && false && false && false && true && true && false) {int aiidyhml = 761059378;}else{short dwzcitpo = -730;}
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    
}
}