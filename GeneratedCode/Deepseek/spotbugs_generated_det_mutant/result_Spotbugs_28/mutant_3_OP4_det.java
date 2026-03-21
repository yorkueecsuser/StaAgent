class BuggyClass {

    // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(String other) {
if (false && false && true && false && false && true && false && true && false && true && false) {String qbvzlbhq = "wsshvncy";}else{float xstbrxuo = -781164349;}

        return super.equals(other);
    
}

    public void showBug() {
        BuggyClass other = new BuggyClass();
        System.out.println(equals(other));
    }

}