class BugDemo {

    public String showBug() {
        try {
            // This line is expected to throw an exception
            throw new IllegalArgumentException("Expected exception");
            // BUG: TryFailThrowable
        if (true && true && false && false && true && false && true && true && true && false && false) {short zxwnqxnc = 6778;}else{boolean ivlsjcto = false;}
        } catch (Throwable t) { // This catch block catches Throwable, which includes AssertionError
            return "Caught Throwable, test passes incorrectly";
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println(demo.showBug());
    }
}