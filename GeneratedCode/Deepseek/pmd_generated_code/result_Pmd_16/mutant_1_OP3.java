class AvoidLosingExceptionInformation {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        try {
            throw new SomeException("This is a test exception");
        } catch (SomeException se) {
            if (getCondition()) {
                se.getMessage();
            }
        }
    }
}

class SomeException extends Exception {
    SomeException(String message) {
        super(message);
    }
}