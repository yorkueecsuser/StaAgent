class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        
        // Unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // Dead code
                break;
            default:
                // Dead code
                break;
        }
    }
}