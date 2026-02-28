class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        int uvwxyzab = 1; // Dead Store
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0);
        int ghijklmn = 2; // Dead Store
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass());
        System.out.println(bug.showBug2().getClass());
    }
}