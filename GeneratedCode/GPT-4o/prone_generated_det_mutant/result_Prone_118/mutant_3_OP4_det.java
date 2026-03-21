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
if (true && false && true && true && true && false && false && false && true && false && false) {char eebnynid = 'o';}else{short urrwihbg = -7415;}

        return Two.Inner.getName(); // BUG: NonCanonicalStaticImport
    
}

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}