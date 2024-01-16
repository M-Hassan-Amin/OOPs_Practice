#include <iostream>
using namespace std;

// int main() {
//     int x = 2;
//     int y = 18;

//     if (x > y) {
//         cout << "x is greater than y" << endl;
//     } else {
//         cout << "y is greater than x" << endl;
//     }

//     return 0;
// }


// int main() {
//     int time = 7;

//     if (time < 9) {
//         cout << "Good morning." << endl;
//     } else if (time < 18) {
//         cout << "Good After Noon." << endl;
//     } else {
//         cout << "Good evening." << endl;
//     }

//     return 0;
// }

#include <iostream>
#include <string>
using namespace std;

int main() {
    string input = "yes";  // or "no"
    double num1 = 10.5;
    double num2 = 20.5;

    if (input == "yes") {
        if (num1 > num2) {
            cout << num1 << " is greater than " << num2 << endl;
        } else if (num2 > num1) {
            cout << num2 << " is greater than " << num1 << endl;
        } else {
            cout << "Both numbers are equal." << endl;
        }
    } else if (input == "no") {
        if (num1 < num2) {
            cout << num1 << " is less than " << num2 << endl;
        } else if (num2 < num1) {
            cout << num2 << " is less than " << num1 << endl;
        } else {
            cout << "Both numbers are equal." << endl;
        }
    } else {
        cout << "Thank you!" << endl;
    }

    return 0;
}
