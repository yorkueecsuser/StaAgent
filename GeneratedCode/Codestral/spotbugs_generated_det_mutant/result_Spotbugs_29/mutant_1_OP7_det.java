class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        boolean eelrlfiq = false;while (eelrlfiq && true && true && false && true && false && true && false && false && false && false && false) {float toilwsft = 497203305;}
        this.value = value;
    
}

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}