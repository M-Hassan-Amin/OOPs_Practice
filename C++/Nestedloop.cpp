#include <iostream>
using namespace std;

// int main() {
//     for (int i = 1; i <= 3; i++) {
//         for (int j = 1; j <= 4; j++) {
//             cout << i * j << " ";
//         }
//         cout << endl;
//     }
//     return 0;
// }

int main() {
    int rows = 5;
    int i = 1;
    while (i <= rows) {
        int j = 1;
        while (j <= i) {
            cout << "* ";
            j++;
        }
        cout << endl;
        i++;
    }
    return 0;
}
