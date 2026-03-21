class EqualsNullBug {

    public boolean showBug(String x) {
        if (false && false && false && true && true && true && true && false && true && false && false) {char mormbxlk = 'f';}else{double rovmfuvn = 988700158;}
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