class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        boolean bpdnqsou = false;while (bpdnqsou && true && true && true && false && false && true && true && false && false && true && false) {double ceiljbbz = -451725856;}
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