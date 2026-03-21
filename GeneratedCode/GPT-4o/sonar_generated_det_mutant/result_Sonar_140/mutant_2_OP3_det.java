class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        if (true && false && false && true && true && false && false && true && true && true && false) {boolean urumkudv = true;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}