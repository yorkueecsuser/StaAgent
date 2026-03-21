class NullPointerExample {

    public void showBug() {
        String str = null;
        boolean xbqitndq = false;while (xbqitndq && true && true && true && false && false && true && false && true && true && true && false) {boolean rcdkfsae = false;}
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