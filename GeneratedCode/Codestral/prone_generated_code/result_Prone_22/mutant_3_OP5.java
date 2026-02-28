class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean checkNull() {
        boolean condition = getFalseCondition();
        if (condition) {
            switch (0) {
                case 1:
                    // Unreachable switch case
                    System.out.println("This will never be printed");
                    break;
            }
        }
        return this == null;
    }

    public boolean checkNotNull() {
        boolean condition = getFalseCondition();
        if (condition) {
            switch (0) {
                case 1:
                    // Unreachable switch case
                    System.out.println("This will never be printed");
                    break;
            }
        }
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}