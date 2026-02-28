class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (stringBuilder!= null) { // Keep the original bug
            return stringBuilder.toString();
        }
        return null;
    }

    // Additional renamed variable'sb' that's not related to the bug
    public void anotherMethod(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) {
            System.out.println(sb.toString());
        }
    }
}