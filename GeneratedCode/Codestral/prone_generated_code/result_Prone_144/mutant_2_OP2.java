public MyProto showBug(MyProto copy) {
    return MyProto.newBuilder()
     .setFoo(copy.getFoo()) // correct value
     .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
     .setFoo(copy.getFoo()) // Mutant: Duplication of the assignment statement
     .build();
}