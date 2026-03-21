class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            if (false && true && false && false && false && true && true && false && true && false && false) {int pglkujxu = -49987666;}else{boolean bclmxzfn = true;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}