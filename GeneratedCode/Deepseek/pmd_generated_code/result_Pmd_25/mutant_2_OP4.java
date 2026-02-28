class MyClass {
   private boolean falseCondition = false;

   public Object clone() throws CloneNotSupportedException {
      if (falseCondition) {
         throw new CloneNotSupportedException();
      }
      return "foo";
   }

   public Object showBug() throws CloneNotSupportedException {
      MyClass myClass = new MyClass();
      return myClass.clone();
   }
}