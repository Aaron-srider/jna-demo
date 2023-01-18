package com.example;

import com.example.utils.jna.JnaUtils;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;

public class Driven {
    public static void main(String[] args) {
        MyLib.SINGLETON.hello();

        //  *(         (void **)(    (char *)Pointer + offset      )      ) = value.

        //MyLib.SINGLETON.get_memo_for_pointer(pointerByReference, 8);

        Pointer pointer;


        int len;

        len = 10;

        byte[] bytes;
        bytes = new byte[len];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) i;
        }
        pointer = JnaUtils.convertBytesToPointer(bytes);
        //pointer.setString(0, "123456789");
        MyLib.SINGLETON.unsigned_char_pointer(pointer, len);
        System.out.println();
        MyLib.SINGLETON.char_pointer(pointer, len);
        pointer.read(0, bytes, 0, bytes.length);
        System.out.println("after change ");
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println();

        pointer = new Memory(Native.getNativeSize(Integer.class));
        pointer.setInt(0, 10);
        MyLib.SINGLETON.int_pointer(pointer);
        MyLib.SINGLETON.const_int_pointer(pointer);
        System.out.println();

        // void **p = (void**)malloc(Pointer.SIZE); *p = NULL;
        PointerByReference pointerByReference;
        pointerByReference = new PointerByReference();
        //System.out.println(pointerByReference.getPointer());
        MyLib.SINGLETON.pointer_pointer(pointerByReference, 5);
        System.out.println();

        pointer = pointerByReference.getPointer().getPointer(0);
        System.out.println(pointer);
        bytes = JnaUtils.readFromPointerToBytes(pointer, 5);
        pointer.read(0, bytes, 0, 5);
        // after malloc
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println();
        //    0x7fb044318180
        //    0x7fb044317f70
    }
}
