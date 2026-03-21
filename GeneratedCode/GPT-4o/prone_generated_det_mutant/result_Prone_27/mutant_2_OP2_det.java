class ConditionalExpressionExample {
public Object showBug(boolean flag){
    Object result = flag ? Double.valueOf(0): Integer.valueOf(0);
    result = flag ? Double.valueOf(0): Integer.valueOf(0);
    return result;
}

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());
    }
}