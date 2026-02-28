class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }

    // Unreachable Switch Statement
    public void unreachableSwitchStatement() {
        boolean condition = false;
        if (condition) {
            // this block of code will never be reached
            switch (1) {
                case 0:
                    int number = 10;
                    break;
            }
        }
    }
}