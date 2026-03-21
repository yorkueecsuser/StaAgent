class NullPointerExample {

    public void showBug() {
        String str = null;
        boolean zvfwlwyl = false;while (zvfwlwyl && true && true && false && true && true && true && false && false && false && true && false) {String qtlmhiwk = "ziujiyly";}
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