class ConditionalExpressionBug {

    public Object showBug() {
        if (true && false && true && false && true && true && true && true && false && true && false) {boolean qazljzre = false;}else{double godxnezo = -28615960;}
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        return new Object[]{t, f};
    
}

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}