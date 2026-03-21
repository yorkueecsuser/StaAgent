class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            for  (int ignkocte = 0; ignkocte < 0; ignkocte++) {double dmninaqk = -869414433;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}