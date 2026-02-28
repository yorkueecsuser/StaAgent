class BuggyCode {

    public boolean showBug(int a, int b) {
        if (true) { // always true
            return true;
        }
        if (a!= a) { // always false
            return false;
        }
        if (a == b && a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b || a == b) { // if the first one is true, the second one is too
            return true;
        }
        String str = "";
        for(int i = 0; i < 0; i++) { str += "unreachable for loop"; } // unreachable for loop

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant
        while(false) { j += 1; break; } // unreachable while loop

        return j;
    }
}