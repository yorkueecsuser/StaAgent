class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        if (true && true && false && true && true && true && true && false && true && true && false) {long nrxfkyzj = -485636050;}else{boolean jfnztmba = true;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}