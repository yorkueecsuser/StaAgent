class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        for  (int hegixcge = 0; hegixcge < 0; hegixcge++) {double tavewlny = 765449342;}
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