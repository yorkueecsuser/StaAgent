class NullParameterViolationExample {

    public void notNullMethod(String p) {
        System.out.println(p.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] z) {
        NullParameterViolationExample e = new NullParameterViolationExample();
        e.showBug();
    }
}