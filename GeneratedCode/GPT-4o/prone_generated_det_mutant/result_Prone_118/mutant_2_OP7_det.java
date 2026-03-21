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
boolean goicucdo = false;while (goicucdo && true && false && true && false && true && true && false && true && true && true && false) {long cauqrwkx = 929156209;}

        return Two.Inner.getName(); // BUG: NonCanonicalStaticImport
    
}

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}