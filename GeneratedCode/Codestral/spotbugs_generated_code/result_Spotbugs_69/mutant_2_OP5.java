class RedundantNullCheckBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) { // Original bug is still present
            switch (getFalseCondition()? 1 : 0) { // Unreachable switch statement
                case 1:
                    System.out.println("This is unreachable code");
                    break;
            }
            return sb.toString();
        }
        return null;
    }
}