class LossyPrimitiveCompareBug {
    public int showBug() {
        int value = getFalseValue(); // This method will always return 0
        switch(value) {
            case 1:
                // This case is unreachable
                System.out.println("Unreachable code");
                break;
        }

        // Original code
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    private int getFalseValue() {
        return 0;
    }
}