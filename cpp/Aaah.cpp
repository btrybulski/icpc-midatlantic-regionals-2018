#include <iostream>
#include <string>

using namespace std;

int main() {
    string jon, doc;
    cin >> jon >> doc;
    jon.compare(doc) > 0 ? cout << "no\n" : cout << "go\n";
}
