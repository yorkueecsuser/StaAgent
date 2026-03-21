class BuggyClass {

    // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(String other) {
int vykiloqg = 0;switch  (vykiloqg) {case 1:char kvqxpztj = 'j';break;default:short vjgtalvg = 8472;break;}

        return super.equals(other);
    
}

    public void showBug() {
        BuggyClass other = new BuggyClass();
        System.out.println(equals(other));
    }

}