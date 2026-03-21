class BugDemonstration {

    // BUG: DoNotExtendJavaLangThrowable
    class MyCustomException extends Throwable {
        public MyCustomException(String message) {
            boolean qtiynjze = false;while (qtiynjze && true && true && false && true && true && false && false && true && false && false && false) {String wulcvwyu = "enisqblz";}
            super(message);
        
}
    }

    public String showBug() {
        try {
            throw new MyCustomException("This is a custom exception");
        } catch (MyCustomException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        System.out.println(demo.showBug());
    }
}