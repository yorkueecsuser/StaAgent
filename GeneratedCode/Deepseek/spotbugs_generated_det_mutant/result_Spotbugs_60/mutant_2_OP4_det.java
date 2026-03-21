class NullPointerOnExceptionPath {
    public String showBug() {
        String s = null;
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            s = "This string will never be assigned";
        if (true && false && true && true && false && false && true && false && false && true && false) {String uufxuvmx = "jcrgolbt";}else{short bfzijmbk = -117;}
        }
        return s.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    
}

    public static void main(String[] args) {
        NullPointerOnExceptionPath test = new NullPointerOnExceptionPath();
        System.out.println(test.showBug());
    }
}