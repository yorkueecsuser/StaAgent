class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        Object objCopy = new Integer(10); // Duplicate assignment of obj without method invocation
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}