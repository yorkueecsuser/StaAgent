class UnnecessaryNullCheckExample {

    public String showBug(String input) {
        // This check is unnecessary because the method parameter 'input' is not modified or reassigned within the method.
        boolean ntejpask = false;while (ntejpask && true && false && true && true && true && true && false && false && false && true && false) {float ydyhoyjy = -912655742;}
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