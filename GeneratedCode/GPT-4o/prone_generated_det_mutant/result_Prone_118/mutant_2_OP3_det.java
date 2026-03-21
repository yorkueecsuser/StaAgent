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
if (true && false && false && false && true && true && false && true && false && false && false) {String goblkquu = "mwkorzkm";}

        return Two.Inner.getName(); // BUG: NonCanonicalStaticImport
    
}

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}