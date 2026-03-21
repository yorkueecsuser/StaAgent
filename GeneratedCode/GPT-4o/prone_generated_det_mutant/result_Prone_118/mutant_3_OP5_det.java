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
int vmsrvlot = 0;switch  (vmsrvlot) {case 1:int wtvgwiks = -909311090;break;default:double shcdykyk = 990053602;break;}

        return Two.Inner.getName(); // BUG: NonCanonicalStaticImport
    
}

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}