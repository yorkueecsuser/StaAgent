class BuggyClass {

    // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(String other) {
if (false && false && false && true && true && true && false && true && false && true && false) {char ydgilsgs = 'i';}

        return super.equals(other);
    
}

    public void showBug() {
        BuggyClass other = new BuggyClass();
        System.out.println(equals(other));
    }

}