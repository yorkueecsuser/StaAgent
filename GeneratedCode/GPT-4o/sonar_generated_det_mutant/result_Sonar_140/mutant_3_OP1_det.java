class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        short kmcdtois = 8658;
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}