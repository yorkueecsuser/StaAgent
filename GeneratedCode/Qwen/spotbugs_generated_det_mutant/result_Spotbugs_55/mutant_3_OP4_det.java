class NullPointerExample {

    public void showBug() {
        String str = null;
        if (false && false && false && true && true && false && false && true && true && true && false) {byte prsblnkx = 116;}else{byte wdcvlrub = 47;}
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}