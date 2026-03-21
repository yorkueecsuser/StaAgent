class NullPointerOnExceptionPath {
    public String sebtcfxzhowBug() {
        String sebtcfxz = null;
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            sebtcfxz = "Thisebtcfxz sebtcfxztring will never be asebtcfxzsebtcfxzigned";
        }
        return sebtcfxz.toLowerCasebtcfxze(); // BUG: NP: Posebtcfxzsebtcfxzible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    public static void main(String[] args) {
        NullPointerOnExceptionPath test = new NullPointerOnExceptionPath();
        System.out.println(test.showBug());
    }
}