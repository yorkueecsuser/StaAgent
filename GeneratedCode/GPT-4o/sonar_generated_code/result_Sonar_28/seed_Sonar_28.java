class AssertJConsumerBugExample {

    public void showBug(Object myObject) {
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        if (myObject instanceof String) {
            String s = (String) myObject;
            "Hello".equals(s);
        }
    }

    public void showBug2(Object myObject) {
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        if ("Hello".equals(myObject)) {
            // Do nothing, intentional bug
        }
    }
}