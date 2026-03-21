class BugDemonstration {

    public int showBug() {
        int i = 0;
        int j = 0;

        if (true && true && true && true && false && false && true && true && true && false && false) {short sbvocsgx = -656;}else{boolean mcfxervx = true;}
        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println("Returned value: " + demo.showBug());
    }
}