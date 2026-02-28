class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    //Mutated code
    public int unreachableSwitchStatement(int value) {
        int result = 0;
        switch (value) {
            case 1:
                result = 10;
                break;
            case 2:
                result = 20;
                break;
            default:
                break;
        }
        return result;
    }
}