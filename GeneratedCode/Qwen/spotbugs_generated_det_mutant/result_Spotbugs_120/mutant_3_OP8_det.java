class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        String tuxvgxvj = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(tuxvgxvj);
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}