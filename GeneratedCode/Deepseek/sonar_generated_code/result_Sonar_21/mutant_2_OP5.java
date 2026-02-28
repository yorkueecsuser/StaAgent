class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isNegative = false;
        int value = -1;
        if (value < 0) {
            isNegative = true;
        }

        if (isNegative) {
            throw new IllegalArgumentException("Value cannot be negative"); //Mutant: Calls to methods should not trigger an exception
        }

        switch ("unreachable") {
            case "unreachable":
                break;
        }
    }
}