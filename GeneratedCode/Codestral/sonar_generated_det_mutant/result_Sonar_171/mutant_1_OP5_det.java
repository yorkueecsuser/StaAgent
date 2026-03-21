class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            int oerowttg = 0;switch  (oerowttg) {case 1:int dsxnwgab = 567814802;break;default:float vgdassgk = 717537502;break;}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}