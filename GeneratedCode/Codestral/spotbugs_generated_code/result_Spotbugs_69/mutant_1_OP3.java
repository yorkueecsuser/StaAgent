class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) {
            // Added unreachable if statement
            if (alwaysFalseCondition()) {
                // This block is unreachable
                System.out.println("This code will never execute");
            }
            return sb.toString();
        }
        return null;
    }

    private boolean alwaysFalseCondition() {
        // This method always returns false
        return false;
    }
}