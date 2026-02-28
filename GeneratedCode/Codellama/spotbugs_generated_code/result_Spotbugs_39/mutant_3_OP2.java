class BadEqual {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
        int i = 0;
        int j = 0;
        int k = 0;
        k = i + j;
        k = i + j; // Duplicated statement
    }
}