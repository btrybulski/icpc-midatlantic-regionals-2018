#include <bits/stdc++.h>
#define rep(i,a,b) for(int i = a; i < b; i++)
using namespace std;
void four_thought(int);

int main() {
    int n, m; cin >> m;
    rep(i,0,m) {
        cin >> n;
        four_thought(n);
    }
}

// sometimes you gotta do what you gotta do
void four_thought(int n) {
    if (4 + 4 + 4 + 4 == n) cout << "4 + 4 + 4 + 4 = " << n << endl;
    else if (4 + 4 + 4 - 4 == n) cout << "4 + 4 + 4 - 4 = " << n << endl;
    else if (4 + 4 + 4 * 4 == n) cout << "4 + 4 + 4 * 4 = " << n << endl;
    else if (4 + 4 + 4 / 4 == n) cout << "4 + 4 + 4 / 4 = " << n << endl;
    else if (4 + 4 - 4 + 4 == n) cout << "4 + 4 - 4 + 4 = " << n << endl;
    else if (4 + 4 - 4 - 4 == n) cout << "4 + 4 - 4 - 4 = " << n << endl;
    else if (4 + 4 - 4 * 4 == n) cout << "4 + 4 - 4 * 4 = " << n << endl;
    else if (4 + 4 - 4 / 4 == n) cout << "4 + 4 - 4 / 4 = " << n << endl;
    else if (4 + 4 * 4 + 4 == n) cout << "4 + 4 * 4 + 4 = " << n << endl;
    else if (4 + 4 * 4 - 4 == n) cout << "4 + 4 * 4 - 4 = " << n << endl;
    else if (4 + 4 * 4 * 4 == n) cout << "4 + 4 * 4 * 4 = " << n << endl;
    else if (4 + 4 * 4 / 4 == n) cout << "4 + 4 * 4 / 4 = " << n << endl;
    else if (4 + 4 / 4 + 4 == n) cout << "4 + 4 / 4 + 4 = " << n << endl;
    else if (4 + 4 / 4 - 4 == n) cout << "4 + 4 / 4 - 4 = " << n << endl;
    else if (4 + 4 / 4 * 4 == n) cout << "4 + 4 / 4 * 4 = " << n << endl;
    else if (4 + 4 / 4 / 4 == n) cout << "4 + 4 / 4 / 4 = " << n << endl;
    else if (4 - 4 + 4 + 4 == n) cout << "4 - 4 + 4 + 4 = " << n << endl;
    else if (4 - 4 + 4 - 4 == n) cout << "4 - 4 + 4 - 4 = " << n << endl;
    else if (4 - 4 + 4 * 4 == n) cout << "4 - 4 + 4 * 4 = " << n << endl;
    else if (4 - 4 + 4 / 4 == n) cout << "4 - 4 + 4 / 4 = " << n << endl;
    else if (4 - 4 - 4 + 4 == n) cout << "4 - 4 - 4 + 4 = " << n << endl;
    else if (4 - 4 - 4 - 4 == n) cout << "4 - 4 - 4 - 4 = " << n << endl;
    else if (4 - 4 - 4 * 4 == n) cout << "4 - 4 - 4 * 4 = " << n << endl;
    else if (4 - 4 - 4 / 4 == n) cout << "4 - 4 - 4 / 4 = " << n << endl;
    else if (4 - 4 * 4 + 4 == n) cout << "4 - 4 * 4 + 4 = " << n << endl;
    else if (4 - 4 * 4 - 4 == n) cout << "4 - 4 * 4 - 4 = " << n << endl;
    else if (4 - 4 * 4 * 4 == n) cout << "4 - 4 * 4 * 4 = " << n << endl;
    else if (4 - 4 * 4 / 4 == n) cout << "4 - 4 * 4 / 4 = " << n << endl;
    else if (4 - 4 / 4 + 4 == n) cout << "4 - 4 / 4 + 4 = " << n << endl;
    else if (4 - 4 / 4 - 4 == n) cout << "4 - 4 / 4 - 4 = " << n << endl;
    else if (4 - 4 / 4 * 4 == n) cout << "4 - 4 / 4 * 4 = " << n << endl;
    else if (4 - 4 / 4 / 4 == n) cout << "4 - 4 / 4 / 4 = " << n << endl;
    else if (4 * 4 + 4 + 4 == n) cout << "4 * 4 + 4 + 4 = " << n << endl;
    else if (4 * 4 + 4 - 4 == n) cout << "4 * 4 + 4 - 4 = " << n << endl;
    else if (4 * 4 + 4 * 4 == n) cout << "4 * 4 + 4 * 4 = " << n << endl;
    else if (4 * 4 + 4 / 4 == n) cout << "4 * 4 + 4 / 4 = " << n << endl;
    else if (4 * 4 - 4 + 4 == n) cout << "4 * 4 - 4 + 4 = " << n << endl;
    else if (4 * 4 - 4 - 4 == n) cout << "4 * 4 - 4 - 4 = " << n << endl;
    else if (4 * 4 - 4 * 4 == n) cout << "4 * 4 - 4 * 4 = " << n << endl;
    else if (4 * 4 - 4 / 4 == n) cout << "4 * 4 - 4 / 4 = " << n << endl;
    else if (4 * 4 * 4 + 4 == n) cout << "4 * 4 * 4 + 4 = " << n << endl;
    else if (4 * 4 * 4 - 4 == n) cout << "4 * 4 * 4 - 4 = " << n << endl;
    else if (4 * 4 * 4 * 4 == n) cout << "4 * 4 * 4 * 4 = " << n << endl;
    else if (4 * 4 * 4 / 4 == n) cout << "4 * 4 * 4 / 4 = " << n << endl;
    else if (4 * 4 / 4 + 4 == n) cout << "4 * 4 / 4 + 4 = " << n << endl;
    else if (4 * 4 / 4 - 4 == n) cout << "4 * 4 / 4 - 4 = " << n << endl;
    else if (4 * 4 / 4 * 4 == n) cout << "4 * 4 / 4 * 4 = " << n << endl;
    else if (4 * 4 / 4 / 4 == n) cout << "4 * 4 / 4 / 4 = " << n << endl;
    else if (4 / 4 + 4 + 4 == n) cout << "4 / 4 + 4 + 4 = " << n << endl;
    else if (4 / 4 + 4 - 4 == n) cout << "4 / 4 + 4 - 4 = " << n << endl;
    else if (4 / 4 + 4 * 4 == n) cout << "4 / 4 + 4 * 4 = " << n << endl;
    else if (4 / 4 + 4 / 4 == n) cout << "4 / 4 + 4 / 4 = " << n << endl;
    else if (4 / 4 - 4 + 4 == n) cout << "4 / 4 - 4 + 4 = " << n << endl;
    else if (4 / 4 - 4 - 4 == n) cout << "4 / 4 - 4 - 4 = " << n << endl;
    else if (4 / 4 - 4 * 4 == n) cout << "4 / 4 - 4 * 4 = " << n << endl;
    else if (4 / 4 - 4 / 4 == n) cout << "4 / 4 - 4 / 4 = " << n << endl;
    else if (4 / 4 * 4 + 4 == n) cout << "4 / 4 * 4 + 4 = " << n << endl;
    else if (4 / 4 * 4 - 4 == n) cout << "4 / 4 * 4 - 4 = " << n << endl;
    else if (4 / 4 * 4 * 4 == n) cout << "4 / 4 * 4 * 4 = " << n << endl;
    else if (4 / 4 * 4 / 4 == n) cout << "4 / 4 * 4 / 4 = " << n << endl;
    else if (4 / 4 / 4 + 4 == n) cout << "4 / 4 / 4 + 4 = " << n << endl;
    else if (4 / 4 / 4 - 4 == n) cout << "4 / 4 / 4 - 4 = " << n << endl;
    else if (4 / 4 / 4 * 4 == n) cout << "4 / 4 / 4 * 4 = " << n << endl;
    else if (4 / 4 / 4 / 4 == n) cout << "4 / 4 / 4 / 4 = " << n << endl;
    else cout << "no solution" << endl;
}
