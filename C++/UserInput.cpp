#include <iostream>
using namespace std;

int main() {
    // Declare a variable to store user input
    string userInput;
    
    // Prompt the user for input
    cout << "Enter something: ";
    
    // Read a line of text from the user
    getline(cin, userInput);
    
    // Display the user's input
    cout << "You entered: " << userInput << endl;
    
    return 0;
}
