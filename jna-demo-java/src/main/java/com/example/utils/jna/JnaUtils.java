package com.example.utils.jna;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JnaUtils {
    public static void free(Pointer p) {
        long peer = Pointer.nativeValue(p);
        Native.free(peer);
        // avoid invoking Native.free() again in GC
        Pointer.nativeValue(p, 0);
    }
    public static byte[] readFromPointerToBytes(Pointer pointer, int len) {
        byte[] bytes = new byte[len];
        pointer.read(0, bytes, 0, len);
        return bytes;
    }

    public static Pointer convertBytesToPointer(byte[] bytes)  {
        Pointer pointer = new Memory(bytes.length);
        pointer.write(0, bytes, 0, bytes.length);
        return pointer;
    }

    public static Pointer convertIntToPointer(int value) {
        Pointer pointer = new Memory(Native.getNativeSize(Integer.class));
        pointer.setInt(0, value);
        return pointer;
    }

    public static Pointer mallocPointer(int len, Class<?> clz) {
        return new Memory((long) Native.getNativeSize(clz) * len);
    }
}
