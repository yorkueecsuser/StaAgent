class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }
public static void showBug() {
    MyObject obj = new MyObject();
    obj = new MyObject();
    obj.equals(obj);
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}