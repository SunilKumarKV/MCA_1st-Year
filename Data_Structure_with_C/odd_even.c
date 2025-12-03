#include<stdio.h>

int main(){ // The main function, where program execution begins
    int num;  // Declare an integer variable named 'num' to store the user's input

    printf("Enter a Number: ");
    scanf("%d", &num);  // Read the integer input from the user and store it in the 'num' variable

    // Check if the number is even or odd using the modulo operator (%)
    // The modulo operator returns the remainder of a division
    if(num %2 == 0) {   // If the remainder of num divided by 2 is 0, the number is even
        printf("%d is an Even Number. \n", num);   // Print that the number is even
    } else {   // Otherwise (if the remainder is not 0), the number is odd
        printf("%d is an odd Number. \n", num);  // Print that the number is odd
    }
    return 0;   // Indicate that the program executed successfully
}