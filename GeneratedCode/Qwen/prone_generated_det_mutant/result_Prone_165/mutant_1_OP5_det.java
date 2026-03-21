class BugDemo {

    public String showBug() {
        try {
            // This line is expected to throw an exception
            throw new IllegalArgumentException("Expected exception");
            // BUG: TryFailThrowable
        int uomxwcpw = 0;switch  (uomxwcpw) {case 1:float sghmweeb = -58810010;break;default:boolean oqgzjkis = true;break;}
        } catch (Throwable t) { // This catch block catches Throwable, which includes AssertionError
            return "Caught Throwable, test passes incorrectly";
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println(demo.showBug());
    }
}