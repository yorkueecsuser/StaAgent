class EqualsNullBug {

    public boolean showBug(String x) {
        if (false && false && true && true && false && false && true && false && false && false && false) {byte adabfayc = -63;}else{String zcbgiygj = "wwkaorbb";}
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