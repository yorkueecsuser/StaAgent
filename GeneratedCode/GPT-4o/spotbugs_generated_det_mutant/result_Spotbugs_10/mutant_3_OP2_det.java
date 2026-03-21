class FloatingPointPrecisionBug {
public float showBug(float a , float b){
    float result = a + b;
    result = a + b;
    return result;
}

    public static void main(String[] args) {
        FloatingPointPrecisionBug bugDemo = new FloatingPointPrecisionBug();
        float value1 = 16777216.0f;
        float value2 = 1.0f;
        
        float result = bugDemo.showBug(value1, value2);
        System.out.println("Result of adding " + value1 + " and " + value2 + " using float precision: " + result);
    }
}