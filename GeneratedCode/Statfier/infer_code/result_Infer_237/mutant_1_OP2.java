import java.io.*;
import java.nio.*;
import java.util.*;

class BufferTest {
  private ByteBuffer data;

  void drainBuffer_linear(ByteBuffer buffer) {
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
      Byte b2 = buffer.get(); // Mutant: Duplicate assignment statement
    }
  }

  void fillBuffer_linear(CharBuffer buffer, int capacity, String string) {
    for (int i = 0; i < capacity; i++) {
      buffer.put(string.charAt(i));
      buffer.put(string.charAt(i)); // Mutant: Duplicate assignment statement
    }
  }

  void wrapBuffer_linear(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
      Byte b2 = buffer.get(); // Mutant: Duplicate assignment statement
    }
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
      Byte b2 = buffer.get(); // Mutant: Duplicate assignment statement
    }
  }

  public void writeTo_linear(OutputStream out) throws IOException {
    byte[] buffer = new byte[8192];
    ByteBuffer data = this.data.duplicate();
    data.clear();
    while (data.hasRemaining()) {
      int count = Math.min(buffer.length, data.remaining());
      data.get(buffer, 0, count);
      out.write(buffer, 0, count);
      data.get(buffer, 0, count); // Mutant: Duplicate assignment statement
      out.write(buffer, 0, count); // Mutant: Duplicate assignment statement
    }
  }
}