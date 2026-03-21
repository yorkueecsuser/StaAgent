class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            boolean cqsdeyqi = false;while (cqsdeyqi && false && true && true && false && true && false && false && false && false && false && false) {int zuggtlyj = -4654412;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}