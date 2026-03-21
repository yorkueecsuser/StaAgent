class BuggyClass {

    // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(String other) {
int tjaxzddv = 0;switch  (tjaxzddv) {case 1:double raohmael = -73042629;break;default:int rblexokw = 802793834;break;}

        return super.equals(other);
    
}

    public void showBug() {
        BuggyClass other = new BuggyClass();
        System.out.println(equals(other));
    }

}