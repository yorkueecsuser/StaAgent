class CompareToBug {
    private boolean alwaysFalse() {
        return false;
    }

    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) { // Bug: RV: Code checks for specific values returned by compareTo
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            int value = a.compareTo(b);
            switch(value) { // Unreachable switch statement
                case 1:
                case -1:
                    if (alwaysFalse()) {
                        return "This should never be reached";
                    }
            }
            return "a and b are equal";
        }
    }
}