class BugDemonstration {

    // BUG: DoNotExtendJavaLangThrowable
    class MyCustomException extends Throwable {
        public MyCustomException(String message) {
            boolean cgjsvbox = false;while (cgjsvbox && false && false && true && true && false && false && false && false && false && true && false) {boolean kfyhgyuu = false;}
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