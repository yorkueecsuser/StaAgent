class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        boolean pocwonae = false;while (pocwonae && true && false && false && true && true && false && false && true && false && false && false) {double xfgqhxom = 304507368;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}