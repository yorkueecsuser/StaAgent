class BadEqual {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public void showBug() {
        String deadStore = "abcdefg";
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}