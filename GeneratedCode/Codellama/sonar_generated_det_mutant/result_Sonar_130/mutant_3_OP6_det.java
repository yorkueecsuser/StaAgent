class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        for  (int eegwibfj = 0; eegwibfj < 0; eegwibfj++) {float ajkqrpvc = 933490761;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}