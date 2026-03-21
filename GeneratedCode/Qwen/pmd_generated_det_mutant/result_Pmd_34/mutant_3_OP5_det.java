class BugDemonstration {

    // BUG: DoNotExtendJavaLangThrowable
    class MyCustomException extends Throwable {
        public MyCustomException(String message) {
            int esyvtkbu = 0;switch  (esyvtkbu) {case 1:float wehealoe = -382993581;break;default:short cqrtmnwr = -4944;break;}
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