class UnnecessaryNullCheckExample {

    public String showBug(String input) {
        // This check is unnecessary because the method parameter 'input' is not modified or reassigned within the method.
        for  (int jteeoiyo = 0; jteeoiyo < 0; jteeoiyo++) {short kuxerose = 4324;}
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