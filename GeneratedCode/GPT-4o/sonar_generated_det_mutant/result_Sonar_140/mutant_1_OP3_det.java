class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        if (true && true && true && true && true && false && false && true && true && false && false) {double sumexvjx = -462875955;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}