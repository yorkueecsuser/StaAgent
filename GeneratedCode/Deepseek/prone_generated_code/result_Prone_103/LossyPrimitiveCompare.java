class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        boolean conditionFor = getCondition();
        int value = getValue();
        // BUG: LossyPrimitiveCompare
        for(int i = 0; conditionFor; i++) {
            // Unreachable code
            return Float.compare(max, diff);
        }
        // Unreachable code
        switch(value) {
            // Unreachable code
            case 1: return Float.compare(max, diff);
        }
        // Unreachable code
        if(false) {
            return Float.compare(max, diff);
        }
        // Unreachable code
        while(false) {
            return Float.compare(max, diff);
        }
        return Float.compare(max, diff);
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }
}