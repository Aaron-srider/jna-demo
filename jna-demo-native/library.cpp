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
