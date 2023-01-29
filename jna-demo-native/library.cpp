#include "library.h"

#include <iostream>

void hello() {
    std::cout << "Hello, World!" << std::endl;
}

void unsigned_char_pointer(unsigned char *bytes, int len) {
    int i;
    for (i = 0; i < len; i++) {
        std::cout << static_cast<int>(bytes[i]++) << std::endl;
    }
    std::cout << static_cast<int>(bytes[i]) << std::endl;
}

void char_pointer(char *bytes, int len) {
    int i;
    for (i = 0; i < len; i++) {
        std::cout << static_cast<int>(bytes[i]++) << std::endl;
    }
}

void int_pointer(int *pint) {
    (*(pint))++;
    std::cout << *(pint) << std::endl;
}

void const_int_pointer(const int *pint) {
    std::cout << *(pint) << std::endl;
}

void pointer_pointer(unsigned char **pp, int len) {
    *pp = new unsigned char[len];
    std::cout << static_cast<void *>((*pp)) << std::endl;
    unsigned char *p = *pp;
    for (int i = 0; i < len; ++i) {
        p[i] = i;
    }
}

void pass_boolean_2_bool(bool value) {
    std::cout << value << std::endl;
    std::cout << !value << std::endl;
    if (!value) {
        std::cout << "false" << std::endl;
    }
    else {
        std::cout << "true" << std::endl;
    }
}


void pass_int_2_bool(bool value) {
    std::cout << "true" << ":" << true << std::endl;
    std::cout << "false" << ":" << false << std::endl;
    std::cout << value << std::endl;
    std::cout << !value << std::endl;

    if (!value) {
        std::cout << "false" << std::endl;
    }
    else {
        std::cout << "true" << std::endl;
    }
}

bool return_bool_true() {
    return true;
}

bool return_bool_false() {
    return false;
}

