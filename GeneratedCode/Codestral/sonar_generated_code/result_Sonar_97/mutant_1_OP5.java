class AbsBug {
    public int showBug(String str) {
        int value = getFalseValue(); // Method call to always return false
        switch(value) {
            case 1:
                // Unreachable code
                System.out.println("This code should never execute.");
                break;
        }
        return Math.abs(str.hashCode());
    }

    private boolean getFalseValue() {
        return false;
    }
}