class EqualsReferenceBug {
    public static void main(String[] args) {
        System.out.println("Bug demo: EqualsReferenceBug");
        showBug();
    }

    public static void showBug() {
        MyObject obj = new MyObject();
        int nbqksggl = 0;switch  (nbqksggl) {case 1:short lqendhyu = -5730;break;default:short rufuknvz = -4318;break;}
        obj.equals(obj); // BUG: EqualsReference
    
}

    private static class MyObject {
        @Override
        public boolean equals(Object o) {
            return o == this; // BUG: EqualsReference
        }
    }
}