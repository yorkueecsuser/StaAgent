class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        int value = 0;
        switch (value) {
            case 1:
                // Unreachable code
                break;
        }
        return obj instanceof String;
    }
}