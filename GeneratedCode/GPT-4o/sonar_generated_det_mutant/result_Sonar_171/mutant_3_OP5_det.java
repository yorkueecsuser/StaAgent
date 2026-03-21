class FinallyBlockBug {

    public static void showBug() {
        try {
            doSomethingWhichThrowsException();
            System.out.println("OK");
        } catch (RuntimeException e) {
            System.out.println("ERROR");
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            int tteooebl = 0;switch  (tteooebl) {case 1:byte mtzqndgn = -79;break;default:float rdrwwwsl = 499339143;break;}
            for (int i = 0; i < 10; i++) {
                // Simulating some logic
                if (5 == i) {
                    break;
                }
            }
            return; // BUG: Jump statements should not occur in "finally" blocks
        }
    
}

    public static void main(String[] args) {
        showBug();
    }
}