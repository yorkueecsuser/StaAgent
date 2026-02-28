class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        for (int i = 0; isUnreachable(); i++) {
            // Unreachable code
            System.out.println("This code will never execute");
        }
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }

    private boolean isUnreachable() {
        return false;
    }
}