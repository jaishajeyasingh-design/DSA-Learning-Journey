#include <stdio.h>
#include <time.h>

int main(void) {
    clock_t start, end;
    double cpu_time_used;
    int a[10][10], b[10][10], sum[10][10];
    int rows, cols, i, j;

    printf("Enter the number of rows (max 10): ");
    if (scanf("%d", &rows) != 1 || rows < 1 || rows > 10) {
        printf("Invalid number of rows. Please enter 1 to 10.\n");
        return 1;
    }

    printf("Enter the number of columns (max 10): ");
    if (scanf("%d", &cols) != 1 || cols < 1 || cols > 10) {
        printf("Invalid number of columns. Please enter 1 to 10.\n");
        return 1;
    }
    printf("Enter the number of rows");
    scanf("%d",&rows);
    printf("Enter the number of columns");
    scanf("%d",&cols);
    printf("\nEnter elements of the first matrix:\n");
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            if (scanf("%d", &a[i][j]) != 1) {
                printf("Invalid input. Please enter integer values only.\n");
                return 1;
            }
        }
    }

    printf("\nEnter elements of the second matrix:\n");
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            if (scanf("%d", &b[i][j]) != 1) {
                printf("Invalid input. Please enter integer values only.\n");
                return 1;
            }
        }
    }

    start = clock();
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            sum[i][j] = a[i][j] + b[i][j];
        }
    }
    end = clock();

    printf("\nResult matrix:\n");
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            printf("%d\t", sum[i][j]);
        }
        printf("\n");
    }

    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;

    printf("Execution Time = %f seconds\n", cpu_time_used);
    return 0;
}