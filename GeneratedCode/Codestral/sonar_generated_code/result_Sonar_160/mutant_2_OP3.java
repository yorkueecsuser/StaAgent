class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch");
        }
        return false;
    }
}