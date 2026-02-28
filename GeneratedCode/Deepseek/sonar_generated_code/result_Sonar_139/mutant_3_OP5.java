class BugDemo {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i); 

        boolean conditionFor = getCondition(); 
        for (int j = 0; conditionFor; j++) { 
            int a = 0; 
        }
    }

    public double showBugCompliant() {
        long i = 0x80003800L;
        return Double.longBitsToDouble(i);   
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());
    }

    public boolean getCondition() {
        return false; 
    }
}