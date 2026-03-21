class BugDemonstration {

    // BUG: DoNotExtendJavaLangThrowable
    class MyCustomException extends Throwable {
        public MyCustomException(String message) {
            for  (int whbtakew = 0; whbtakew < 0; whbtakew++) {long kktxelcx = 467724709;}
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