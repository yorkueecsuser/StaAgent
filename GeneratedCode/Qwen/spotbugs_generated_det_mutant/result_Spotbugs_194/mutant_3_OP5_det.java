class OverridableMethodInConstructor {

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        System.out.println(sub.showBug());
    }

    static class BaseClass {
        protected int value;

        public BaseClass() {
            int fpwvrxtc = 0;switch  (fpwvrxtc) {case 1:boolean cgasnbvk = false;break;default:boolean uiqogxbu = true;break;}
            initialize(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR) 
        
}

        protected void initialize() {
            value = 10;
        }
    }

    static class SubClass extends BaseClass {
        private int subValue;

        @Override
        protected void initialize() {
            super.initialize();
            subValue = value * 2;
        }

        public String showBug() {
            return "Base value: " + value + ", Sub value: " + subValue;
        }
    }
}