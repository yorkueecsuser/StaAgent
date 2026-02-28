import java.io.*;
import java.nio.*;
import java.util.*;

class BufferTest {
  private ByteBuffer data;

  void drainBuffer_linear(ByteBuffer buffer) {
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant: Renaming 'buffer' to 'a'
    ByteBuffer a = buffer;
    while (a.hasRemaining()) {
      Byte c = a.get();
    }
  }

  void fillBuffer_linear(CharBuffer buffer, int capacity, String string) {
    for (int i = 0; i < capacity; i++) {
      buffer.put(string.charAt(i));
    }
    // Mutant: Renaming 'buffer' to 'b'
    CharBuffer b = buffer;
    for (int j = 0; j < capacity; j++) {
      b.put(string.charAt(j));
    }
  }

  void wrapBuffer_linear(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant: Renaming 'buffer' to 'c'
    ByteBuffer c = ByteBuffer.wrap(arr);
    while (c.hasRemaining()) {
      Byte d = c.get();
    }
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant: Renaming 'buffer' to 'd'
    ByteBuffer d = ByteBuffer.allocate(10);
    while (d.hasRemaining()) {
      Byte e = d.get();
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
    }
    // Mutant: Renaming 'data' to 'f'
    ByteBuffer f = this.data.duplicate();
    f.clear();
    while (f.hasRemaining()) {
      int g = Math.min(buffer.length, f.remaining());
      f.get(buffer, 0, g);
      out.write(buffer, 0, g);
    }
  }
}