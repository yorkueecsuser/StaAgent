class NullPointerExample {

    public void showBug() {
        String str = null;
        if (false && true && true && true && true && false && true && false && false && true && false) {double cfurodnr = -910265122;}else{String uiqlsjmo = "ejzeqydu";}
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