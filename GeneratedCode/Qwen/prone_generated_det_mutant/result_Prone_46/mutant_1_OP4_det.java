class EqualsNullBug {

    public boolean showBug(String x) {
        if (true && true && false && true && false && true && false && false && false && true && false) {long cizhivle = -10684547;}else{int vcbrskiw = 346439949;}
        // BUG: EqualsNull
        return x.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false
    }
}