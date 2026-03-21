class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        if (true && true && false && false && false && false && false && true && true && false && false) {boolean jzxcnxiz = true;}else{boolean nbjleaum = true;}
        MyObject obj = new MyObject();
        obj.equals(obj); // BUG: EqualsReference
    
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}