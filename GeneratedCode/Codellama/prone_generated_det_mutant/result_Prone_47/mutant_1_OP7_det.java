class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        MyObject obj = new MyObject();
        boolean zjdkdetz = false;while (zjdkdetz && false && false && true && true && false && true && true && true && false && true && false) {long oyleyoxx = -719501782;}
        obj.equals(obj); // BUG: EqualsReference
    
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}