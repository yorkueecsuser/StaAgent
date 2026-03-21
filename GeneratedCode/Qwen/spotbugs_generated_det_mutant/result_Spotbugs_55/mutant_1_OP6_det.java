class NullPointerExample {

    public void showBug() {
        String str = null;
        for  (int fqdaxcno = 0; fqdaxcno < 0; fqdaxcno++) {int elbtzaqy = -123602371;}
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