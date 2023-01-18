#ifndef UNTITLED1_LIBRARY_H
#define UNTITLED1_LIBRARY_H

#ifdef __cplusplus
extern "C" {
#endif

void hello();
void const_int_pointer(const int *pint);
void int_pointer(int *pint);
void unsigned_char_pointer(unsigned char *bytes, int len);
void char_pointer(char *bytes, int len);

void pointer_pointer(unsigned char ** pp,  int len);

#ifdef __cplusplus
};
#endif


#endif //UNTITLED1_LIBRARY_H
