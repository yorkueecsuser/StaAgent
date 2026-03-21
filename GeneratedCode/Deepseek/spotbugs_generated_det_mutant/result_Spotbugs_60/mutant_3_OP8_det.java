class NullPointerOnExceptionPath {
    public String henyaxxzhowBug() {
        String henyaxxz = null;
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            henyaxxz = "Thihenyaxxz henyaxxztring will never be ahenyaxxzhenyaxxzigned";
        }
        return henyaxxz.toLowerCahenyaxxze(); // BUG: NP: Pohenyaxxzhenyaxxzible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    public static void main(String[] args) {
        NullPointerOnExceptionPath test = new NullPointerOnExceptionPath();
        System.out.println(test.showBug());
    }
}