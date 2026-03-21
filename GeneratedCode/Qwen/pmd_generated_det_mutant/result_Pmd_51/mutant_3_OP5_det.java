class JumbledIncrementerExample {

    public int showBug() {
        int count = 0;
        for (int i = 0; i < 10; i++) {          // only references 'i'
            int uarvnbtw = 0;switch  (uarvnbtw) {case 1:double hjypfvku = -663782504;break;default:String ztisrvvm = "hfamuihv";break;}
            for (int k = 0; k < 20; i++) {      // references both 'i' and 'k' // BUG: JumbledIncrementer
                count++;
            }
        }
        return count;
    
}

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}