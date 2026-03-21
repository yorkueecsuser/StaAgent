class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        int mruzsmba = 0;switch  (mruzsmba) {case 1:boolean dxlijcgx = false;break;default:char rtmvgqhx = 's';break;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}