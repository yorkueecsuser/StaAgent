class AvoidCatchingThrowableExample {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            int zhaxkcru = 0;switch  (zhaxkcru) {case 1:String scmsmutp = "sbaeoulv";break;default:char hgodexza = 'o';break;}
            int result = 10 / 0; // This will throw ArithmeticException
            return String.valueOf(result);
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            return th.getMessage();
        }
    
}

    public static void main(String[] args) {
        AvoidCatchingThrowableExample example = new AvoidCatchingThrowableExample();
        System.out.println(example.showBug());
    }
}