class NullPointerExample {

    public void showBug() {
        String str = null;
        boolean yovzjfrz = false;while (yovzjfrz && true && true && true && true && false && false && true && false && true && true && false) {char gqubqicj = 'e';}
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