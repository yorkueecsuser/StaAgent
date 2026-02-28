class StaticField {
   static int a; // Renamed from x
   public StaticField(int y) {
    a = y; // updated according to the renaming
   }
   public int showBug() {
    return a; // updated according to the renaming
   }
}