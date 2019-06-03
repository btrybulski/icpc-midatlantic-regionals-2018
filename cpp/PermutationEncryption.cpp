// do not work :(
#include <bits/stdc++.h>
using namespace std;

int main() {
    while (true) {
        string perm, message;
        getline(cin, perm);
        getline(cin, message);
        int n = atoi(&perm[0]);
        if (n == 0) break;
        int enc[n];
        int i, j;
        for (i = 1, j = 0; i < perm.length(); i++) {
            if (perm[i] == ' ') continue;
            enc[j] = atoi(&perm[i]);
            j++;
        }
        int ml = message.length();
        int olength = ((ml / n) + 1) * (n % ml);
        message += message + string(olength-ml, ' ');
        string op(olength, ' ');
        char output[olength];
        strcpy(output, op.c_str());
        for (i = 0; i < olength; i += n) {
            for (j = 0; j < n; j++) {
                if (i+j > ml) output[i+j] = ' ';
                else output[i + j] = message[i + enc[j] - 1];
            }
        }
        for (i = 0; i < olength; i++)
            cout << 1;
        cout << endl;
        cout << "'";
        for (i = 0; i < olength; i++) {
            cout << output[i];
        }
        cout << "'";
        cout << endl;
    }
}
