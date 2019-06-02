#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    int N, i;
    string firstWord, secondWord, restOfLine;
    vector<string> lines;
    cin >> N;

    for (i = 0; i < N; i++) {
        cin >> firstWord;
        if (firstWord != "Simon") {
            getline(cin, restOfLine);
            continue;
        }
        cin >> secondWord;
        if (secondWord != "says") {
            getline(cin, restOfLine);
            continue;
        }
        getline(cin, restOfLine);
        lines.push_back(restOfLine);
    }

    for (auto l : lines) cout << l.substr(1, l.length()) << endl;
    return 0;
}
