class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        int sypxllsj = 0;switch  (sypxllsj) {case 1:boolean kcqopppp = true;break;default:long yivoeswz = 277193128;break;}
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    
}

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}