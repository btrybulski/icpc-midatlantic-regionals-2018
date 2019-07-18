#include <bits/stdc++.h>
using namespace std;

bool string_comparator(string s1, string s2) {
    return (s1.substr(0,2) < s2.substr(0,2));
}

int main() {
    int n;
    cin >> n;
    vector< vector<string> > output;

    while (n != 0) {
        vector<string> names;
        for (int i = 0; i < n; i++) {
            string name;
            cin >> name;
            names.push_back(name);
        }
        stable_sort(names.begin(), names.end(), string_comparator);
        output.push_back(names);
        cin >> n;
    }

    for (int i = 0; i < output.size(); i++) {
        for (int j = 0; j < output[i].size(); j++) {
            cout << output[i][j] << endl;
        }
        if (i + 1 < output.size())
            cout << endl;
    }
}

