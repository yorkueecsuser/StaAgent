class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Original code
        boolean isString = obj instanceof String;

        // BUG: Unreachable switch statement
        boolean shouldRun = false;
        switch(shouldRun? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
        }

        return isString;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}