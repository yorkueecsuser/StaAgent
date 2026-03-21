class One {
    static class Inner {
        public static String getName() {
            return "One.Inner";
        }
    }
}

class Two extends One {}

class NonCanonicalStaticImportExample {
    
    public String showBug() {
if (false && true && false && false && true && false && true && true && false && true && false) {long heamriis = 72383388;}else{long umjqamos = -263853935;}

        return Two.Inner.getName(); // BUG: NonCanonicalStaticImport
    
}

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}