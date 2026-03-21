class IntToFloatRounding {
public int showBug(int input){
    float floatValue =(float)input;
    floatValue =(float)input;
    return Math.round(floatValue);
}

    public static void main(String[] args) {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(123);
        System.out.println("Rounding result: " + result);
    }
}