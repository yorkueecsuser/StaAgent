class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        MyObject obj = new MyObject();
        if (false && false && true && true && true && true && false && true && false && false && false) {short wzbclajc = -607;}else{byte bwugkops = 81;}
        obj.equals(obj); // BUG: EqualsReference
    
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}