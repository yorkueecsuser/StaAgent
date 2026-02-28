class LossyPrimitiveCompareBug {
    public int showBug() {
        int value = 0; // Make the switch statement unreachable.
        switch (value) {
            case 1:
                // Unreachable code block.
                break;
        }
        // Original code.
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}