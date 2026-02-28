class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Unreachable switch statement mutant
    public int unreachableSwitch(int value) {
        int result = 0;
        switch (value) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 2;
                break;
            default:
                result = 3;
                break;
        }
        return result;
    }
}