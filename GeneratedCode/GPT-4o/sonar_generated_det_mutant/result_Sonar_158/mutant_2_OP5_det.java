class SynchronizationBugExample {

    private Integer a = 0;
    private Integer b = 0;

    public void syncMethod(int x) {
        synchronized (a) { // BUG: Synchronization should not be done on instances of value-based classes
            if (a.equals(x)) {
                System.out.println("Doing something with a");
            }
        }

        int cswkwtbt = 0;switch  (cswkwtbt) {case 1:byte pmumkckz = -104;break;default:double ktmkictm = 504163930;break;}
        synchronized (b) { // BUG: Synchronization should not be done on instances of value-based classes
            if (b.equals(x)) {
                System.out.println("Doing something with b");
            }
        }
    
}

    public void showBug(int x) {
        // Demonstrating the bug by calling the syncMethod
        syncMethod(x);
    }

    public static void main(String[] args) {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(0); // You can call this method with different values to see how it behaves
    }
}