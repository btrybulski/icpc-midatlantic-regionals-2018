#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, R, S, i;
    cin >> N;
    vector<int> bits; 
    while (N > 0) {
        bits.push_back(N & 1);
        N /= 2;
    }
    for (i = 0, R = 0, S = bits.size(); i < S; i++) {
        R += bits[i] << (S-i-1);
    }
    cout << R << endl;
}
