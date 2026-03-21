class UnnecessaryNullCheckExample {

    public String showBug(String input) {
        // This check is unnecessary because the method parameter 'input' is not modified or reassigned within the method.
        boolean ljspyzwg = false;while (ljspyzwg && true && false && false && false && true && false && true && true && true && false && false) {String nneybitj = "btifpnhl";}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return "Input is not null: " + input;
        } else {
            return "Input is null";
        }
    
}

    public static void main(String[] args) {
        UnnecessaryNullCheckExample example = new UnnecessaryNullCheckExample();
        System.out.println(example.showBug("Hello"));
        System.out.println(example.showBug(null));
    }
}