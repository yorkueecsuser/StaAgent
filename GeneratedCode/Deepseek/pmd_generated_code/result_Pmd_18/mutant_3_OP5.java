class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        boolean unreachable = false; // added unreachable boolean
        if (unreachable) { // added unreachable if statement
        	// added unreachable switch statement
        	int unreachableValue = 0;
            switch(unreachableValue){
                case 0: // added unreachable case statement
                // some unreachable code
            }
        }
        return k;
    }
}