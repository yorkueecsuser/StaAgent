class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            int llstezig = 0;switch  (llstezig) {case 1:double ksanqezq = -117330678;break;default:boolean lugxwzeo = true;break;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}