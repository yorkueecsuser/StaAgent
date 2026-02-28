class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            int value = getUnreachableValue();
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    private int getUnreachableValue() {
        return 0; // This always returns a value that is not 1, making the switch unreachable.
    }
}