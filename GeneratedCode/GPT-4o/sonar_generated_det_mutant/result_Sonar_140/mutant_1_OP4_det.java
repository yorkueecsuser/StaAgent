class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        if (true && true && true && true && false && false && true && true && false && true && false) {int dqztmcpr = 347114993;}else{double djloofjy = -441046843;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}