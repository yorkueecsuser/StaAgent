class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            if (true && false && false && true && true && false && false && false && false && true && false) {boolean hcdzylmp = true;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}