class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        int txuvwpts = 0;switch  (txuvwpts) {case 1:short jwasghqk = -9049;break;default:double lyqradoa = 691315378;break;}
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