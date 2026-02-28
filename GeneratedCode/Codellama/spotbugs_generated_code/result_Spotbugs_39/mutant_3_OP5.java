class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    public void unreachableSwitchStatement(int input) {
        switch (input) {
            case 0:
                // do something
                break;
            default:
                // do something
                break;
        }
    }
}