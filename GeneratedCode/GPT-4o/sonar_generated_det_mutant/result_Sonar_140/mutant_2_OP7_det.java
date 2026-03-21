class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        boolean rxqbshsh = false;while (rxqbshsh && true && true && false && true && true && true && true && false && false && true && false) {double ufvefsgd = 552647511;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}