class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This should not be printed");
                    break;
            }
            return true;
        }
        return false;
    }

    private int getUnreachableValue() {
        return -1;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}