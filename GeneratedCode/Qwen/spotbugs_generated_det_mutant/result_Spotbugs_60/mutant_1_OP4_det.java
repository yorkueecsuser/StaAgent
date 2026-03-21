class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some operation that might throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        if (false && false && false && false && false && true && true && true && true && false && false) {short nwxdhlht = 140;}else{double nulefrvp = -952318332;}
        }
        return result.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}