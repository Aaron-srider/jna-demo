package com.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;

public interface MyLib extends Library {

    MyLib SINGLETON = (MyLib) Native.loadLibrary("jna-demo-native", MyLib.class);

    public void hello();

    public boolean return_bool_true();
    public boolean return_bool_false();

    public void pass_boolean_2_bool(boolean bool);
    public void pass_int_2_bool(int bool);

    public void int_pointer(Pointer pint);
    public void const_int_pointer(Pointer pint);

    //public void get_memo_for_pointer(PointerByReference pp, int len);

    //void bytes(unsigned char *bytes, int len)
    public void unsigned_char_pointer(Pointer bytes, int len);

    public void char_pointer(Pointer bytes, int len);

    public void pointer_pointer(PointerByReference pp, int len);

}