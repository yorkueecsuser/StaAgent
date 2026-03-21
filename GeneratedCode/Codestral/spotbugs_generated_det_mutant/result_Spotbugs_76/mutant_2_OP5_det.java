class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        int djanljmv = 0;switch  (djanljmv) {case 1:char pphrhdui = 'm';break;default:long bnljvene = 507945493;break;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}