#include <stdio.h>
struct polynomial {
    int coeff, expo;
};
int main() {
    struct polynomial poly1[10], poly2[10], result[20];
    int i = 0, j = 0, k = 0, n1 = 0, n2 = 0;
    printf("Enter the number of terms in the first polynomial: ");
    scanf("%d", &n1);
    printf("Enter the terms in descending order of the exponent:\n");
    for(i = 0; i < n1; i++) {
        printf("Enter coefficient and exponent for term %d: ", i + 1);
        scanf("%d %d", &poly1[i].coeff, &poly1[i].expo);
    }

    printf("Enter the number of terms in the second polynomial: ");
    scanf("%d", &n2);
    printf("Enter the terms in descending order of the exponent:\n");
    for(j = 0; j < n2; j++) {
        printf("Enter coefficient and exponent for term %d: ", j + 1);
        scanf("%d %d", &poly2[j].coeff, &poly2[j].expo);
    }
    i = 0;
    j = 0;
    k = 0;
    while(i < n1 && j < n2) {
        if(poly1[i].expo == poly2[j].expo) {
            result[k].expo = poly1[i].expo;
            result[k].coeff = poly1[i].coeff + poly2[j].coeff;
            i++; j++; k++;
        }
        else if(poly1[i].expo > poly2[j].expo) {
            result[k] = poly1[i];
            i++; k++;
        }
        else {
            result[k++] = poly2[j++];

        }
    }
    while(i < n1) {
        result[k++] = poly1[i++];
    }
    while(j < n2) {
        result[k++] = poly2[j++];

    }

    printf("Resultant polynomial is: ");
    for(i = 0; i < k; i++) {
        printf("%dx^%d", result[i].coeff, result[i].expo);
        if(i != k - 1)
            printf(" + ");
    }
    return 0;
}
