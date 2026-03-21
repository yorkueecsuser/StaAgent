class NullPointerExample {

    public void showBug() {
        String str = null;
        if (true && false && true && true && true && true && false && true && false && false && false) {byte ttwmohmo = -105;}else{byte tjjwczlq = -54;}
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