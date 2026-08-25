#include <stdio.h>

int main() {
    int a[10][10], b[10][10], c[10][10];
    int rows, cols, i, j, k;
    
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);
    
    printf("\nElements of the first matrix:\n");
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            scanf("%d", &a[i][j]);
        }
    }
    
    printf("\nEnter elements of second matrix:\n");
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            scanf("%d", &b[i][j]);
        }
    }
    
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            c[i][j] = 0;
            for(k = 0; k < cols; k++) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    printf("\nResultant matrix:\n");
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }

    return 0;
}