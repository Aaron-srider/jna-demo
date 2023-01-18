cmake_minimum_required(VERSION 3.17)
project(jna-demo-native)

set(CMAKE_CXX_STANDARD 14)

add_library(jna-demo-native SHARED library.cpp)

INSTALL(TARGETS jna-demo-native
        LIBRARY DESTINATION /usr/local/lib/jna-demo/
        )
