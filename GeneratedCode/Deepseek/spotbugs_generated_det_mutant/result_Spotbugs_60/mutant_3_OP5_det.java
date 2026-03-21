class NullPointerOnExceptionPath {
    public String showBug() {
        String s = null;
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            s = "This string will never be assigned";
        int vsjhbhuk = 0;switch  (vsjhbhuk) {case 1:short nxyyzplm = -7252;break;default:int gbwgovoc = 919413718;break;}
        }
        return s.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    
}

    public static void main(String[] args) {
        NullPointerOnExceptionPath test = new NullPointerOnExceptionPath();
        System.out.println(test.showBug());
    }
}