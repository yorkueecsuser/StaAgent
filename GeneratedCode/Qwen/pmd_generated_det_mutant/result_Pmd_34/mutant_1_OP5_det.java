class BugDemonstration {

    // BUG: DoNotExtendJavaLangThrowable
    class MyCustomException extends Throwable {
        public MyCustomException(String message) {
            int kvuwvncy = 0;switch  (kvuwvncy) {case 1:char cfkgdspg = 'g';break;default:String msapemgn = "kanuvyli";break;}
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