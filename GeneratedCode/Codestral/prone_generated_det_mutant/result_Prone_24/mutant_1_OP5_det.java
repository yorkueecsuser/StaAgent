class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        int cprxfkxb = 0;switch  (cprxfkxb) {case 1:long yznqkwmp = 109027825;break;default:String cnnfyojz = "ovrzikug";break;}
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    
}

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}