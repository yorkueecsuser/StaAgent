import java.io.*;
import java.nio.*;
import java.util.*;

class BufferTest {
  private ByteBuffer data;

  void drainBuffer_linear(ByteBuffer buffer) {
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
      Byte b2 = buffer.get(); // Mutant: duplicated assignment statement
    }
  }

  void fillBuffer_linear(CharBuffer buffer, int capacity, String string) {
    for (int i = 0; i < capacity; i++) {
      buffer.put(string.charAt(i));
      buffer.put(string.charAt(i)); // Mutant: duplicated assignment statement
    }
  }

  void wrapBuffer_linear(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    ByteBuffer buffer2 = ByteBuffer.wrap(arr); // Mutant: duplicated assignment statement
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    ByteBuffer buffer2 = ByteBuffer.allocate(10); // Mutant: duplicated assignment statement
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
  }

  public void writeTo_linear(OutputStream out) throws IOException {
    byte[] buffer = new byte[8192];
    byte[] buffer2 = new byte[8192]; // Mutant: duplicated assignment statement
    ByteBuffer data = this.data.duplicate();
    ByteBuffer data2 = this.data.duplicate(); // Mutant: duplicated assignment statement
    data.clear();
    data2.clear(); // Mutant: duplicated assignment statement
    while (data.hasRemaining()) {
      int count = Math.min(buffer.length, data.remaining());
      int count2 = Math.min(buffer.length, data.remaining()); // Mutant: duplicated assignment statement
      data.get(buffer, 0, count);
      data.get(buffer, 0, count); // Mutant: duplicated assignment statement
      out.write(buffer, 0, count);
      out.write(buffer, 0, count); // Mutant: duplicated assignment statement
    }
  }
}