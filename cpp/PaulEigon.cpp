#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, P, Q;
    cin >> N >> P >> Q;
    if (((P+Q) / N) % 2 == 0) {
        cout << "paul" << endl;
    } else {
        cout << "opponent" << endl;
    }
}
