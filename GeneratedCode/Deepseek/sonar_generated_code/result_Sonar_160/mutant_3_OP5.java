class BuggyCode {

    public boolean showBug(int a, int b) {
        boolean isTrue = true;
        if (isTrue) { // always true
            return true;
        }
        if (!isTrue) { // always false
            return false;
        }
        if (a == b && a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b || a == b) { // if the first one is true, the second one is too
            return true;
        }

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        boolean isTrue = false;
        int j;
        if (isTrue) {
            j = a << a; // Noncompliant
        } else {
            switch (a) {
                case 1:
                    j = a << a;
                    break;
                default:
                    j = 0;
                    break;
            }
        }
        return j;
    }
}