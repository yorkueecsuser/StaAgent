class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This code should not be reached");
                    break;
                default:
                    break;
            }
            return "A. O. K."; // Original code
        }
    }

    private int getValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }
}