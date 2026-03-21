class LossyPrimitiveCompareExample {
public int showBug(int value1 , int value2){
    int result = Float.compare(value1 , value2);
    result = Float.compare(value1 , value2);
    return result;
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}