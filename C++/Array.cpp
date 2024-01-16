#include <iostream>
#include <string>
#include <vector>
using namespace std;


int main() {
    string cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
    int myNum[] = {10, 20, 30, 40};

    cout << "Array is :- " << cars << endl;
    cout << "Array is :- " << myNum << endl;


    // Declaring and initializing an array of integers
    int numbers[] = {1, 2, 3, 4, 5,6};

    // Accessing elements of the array
    cout << "First element: " << numbers[0] << endl; 
    cout << "Third element: " << numbers[2] << endl; 

    // Modifying elements of the array
    numbers[1] = 10;
    cout << "Modified second element: " << numbers[1] << endl;

    // Finding the length of the array
    int length = sizeof(numbers) / sizeof(numbers[0]);
    cout << "Length of the array: " << length << endl; 

    // Two Dimensional Array....
    int mynumbers[][4] = { {1, 2, 3, 4}, {5, 6, 7} };
    cout << "Two Dimensional Array --> " << mynumbers[1][2] << endl;


    vector<int> vec;
    vec.push_back(95);

    cout << "First element: " << vec[0] << endl;

    return 0;

}