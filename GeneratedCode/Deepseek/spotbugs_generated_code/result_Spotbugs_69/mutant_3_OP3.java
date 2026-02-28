class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean unreachableCondition = false;
        if (sb!= null && unreachableCondition) {
            return "Unreachable code";
        }
        if (sb!= null) {
            return sb.toString();
        }
        return null;
    }
}