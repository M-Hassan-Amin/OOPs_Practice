// #include <iostream>
// using namespace std;

// int main() {
//     // Printing numbers from 1 to 5
//     for (int i = 1; i <= 5; i++) {
//         cout << "Number: " << i << endl;
//     }
//     return 0;
// }


#include <iostream>
using namespace std;

int main() {
    // An array of integers
    int numbers[] = {1, 2, 3, 4, 5};
    int n = sizeof(numbers) / sizeof(numbers[0]);

    // Using a for loop to get elements from the array
    for (int i = 0; i < n; i++) {
        cout << "Element at index " << i << ": " << numbers[i] << endl;
    }

    return 0;
}
