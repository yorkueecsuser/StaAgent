class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests
        if (x == 0 || x == 0) {
            // Unreachable switch statement
            switch(false) {
                case true:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
        return x == 0 || x == 0;
    }
}