class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        for  (int tuxvfxiv = 0; tuxvfxiv < 0; tuxvfxiv++) {short cqpkzxsi = -7480;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}