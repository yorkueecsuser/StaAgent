class ArrayBugExample {
    public void showBug() {
        int[] mfldahwk = {1, 2, 3};
        System.out.println(mfldahwk.hashCode());  // BUG: "hashCode" and "toString" should not be called on mfldahwk instances
        System.out.println(mfldahwk.toString());  // BUG: "hashCode" and "toString" should not be called on mfldahwk instances
    }
}