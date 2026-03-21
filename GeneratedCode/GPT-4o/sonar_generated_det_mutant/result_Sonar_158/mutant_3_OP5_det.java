class SynchronizationBugExample {

    private Integer a = 0;
    private Integer b = 0;

    public void syncMethod(int x) {
        int xjmkbtpw = 0;switch  (xjmkbtpw) {case 1:short dzsfmrqq = -4506;break;default:double venonlah = -344162013;break;}
        synchronized (a) { // BUG: Synchronization should not be done on instances of value-based classes
            if (a.equals(x)) {
                System.out.println("Doing something with a");
            }
        }

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