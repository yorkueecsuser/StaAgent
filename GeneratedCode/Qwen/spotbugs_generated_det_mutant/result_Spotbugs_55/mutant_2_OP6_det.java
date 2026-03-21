class NullPointerExample {

    public void showBug() {
        String str = null;
        for  (int ipwwtuxh = 0; ipwwtuxh < 0; ipwwtuxh++) {String nugmifqe = "zraohbjs";}
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