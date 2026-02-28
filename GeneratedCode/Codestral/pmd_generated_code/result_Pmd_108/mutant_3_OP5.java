class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean condition = false;
        switch (condition) {
            case true:
                // Unreachable code
                System.out.println("This should not be printed");
                break;
        }
        return str.trim().length() == 0;
    }

    private boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}