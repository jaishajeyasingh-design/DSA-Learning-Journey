#include <stdio.h>
int main() {
    int a = 5;
    int b = 10;
    int min= (a < b) ? a : b;
    printf("Minimum of %d and %d is: %d\n", a, b, min);
    return 0;
}