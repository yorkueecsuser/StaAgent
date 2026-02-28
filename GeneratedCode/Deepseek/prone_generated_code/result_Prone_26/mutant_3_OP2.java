counterMap.computeIfAbsent(someLong, AtomicLong::new); // Mutant 1
counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutant 2