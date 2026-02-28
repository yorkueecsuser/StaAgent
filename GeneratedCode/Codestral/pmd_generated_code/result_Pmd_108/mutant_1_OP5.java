class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean condition = isFalseCondition();
        if (condition) {
            int value = getInvalidValue();
            switch(value) {
                case 1:
                    // Unreachable mutant code
                    System.out.println("This should never be executed");
                    break;
            }
        }
        return str.trim().length() == 0;  // Original code
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isFalseCondition() {
        return false;
    }

    private int getInvalidValue() {
        return 0;
    }
}