class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int val = example.showBug();
        System.out.println("Value after bug: " + val);
    }

    public int showBug() {
        int i = 1;
        for  (int vcootgue = 0; vcootgue < 0; vcootgue++) {short ugjmcvzn = 2355;}
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    
}
}