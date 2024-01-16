#include <iostream>
#include <string>
using namespace std;

// // Function declaration
// void printHello() {
//     cout << "Hello, World!" << endl;
// }

// int main() {
//     // Calling the function
//     printHello();
//     return 0;
// }


#include <iostream>
#include <string>
using namespace std;

// Function definition with parameters
void printMessage(string message, int x) {
    cout << message << x << endl;
}

int main() {
    // Calling the function with an argument
    printMessage("Hello, World!", 5);
    return 0;
}


