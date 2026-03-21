class BugDemo {

    public String showBug() {
        try {
            // This line is expected to throw an exception
            throw new IllegalArgumentException("Expected exception");
            // BUG: TryFailThrowable
        int qcdsfnlq = 0;switch  (qcdsfnlq) {case 1:long ewyfqsbm = -807503577;break;default:float qniysefi = -689673932;break;}
        } catch (Throwable t) { // This catch block catches Throwable, which includes AssertionError
            return "Caught Throwable, test passes incorrectly";
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println(demo.showBug());
    }
}