class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        boolean onuvllzx = false;while (onuvllzx && true && false && true && true && true && true && true && true && true && false && false) {char hyhndwkp = 'b';}
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        return new Object[]{t, f};
    
}

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}