class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        MyObject obj = new MyObject();
        if (false && true && false && false && true && true && false && true && false && false && false) {long hqvyqbdk = -651928839;}
        obj.equals(obj); // BUG: EqualsReference
    
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}