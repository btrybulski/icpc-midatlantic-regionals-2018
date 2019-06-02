#include <bits/stdc++.h>
using namespace std;

double ev(int min, int max) {
    int sum = 0;
    int sides = (max - min + 1);
    for (int i = 0; i < sides; i++) {
        sum += min + i; 
    }
    return (double) sum / (double) sides;
}

int main() {
    int ga1, gb1, ga2, gb2; // gunnar's dice
    int ea1, eb1, ea2, eb2; // emma's dice
    cin >> ga1 >> gb1 >> ga2 >> gb2;
    cin >> ea1 >> eb1 >> ea2 >> eb2;
    double gev1 = ev(ga1, gb1);
    double gev2 = ev(ga2, gb2);
    double eev1 = ev(ea1, eb1);
    double eev2 = ev(ea2, eb2);

    double gunnar_prob = gev1 + gev2;
    double emma_prob = eev1 + eev2;

    if (gunnar_prob > emma_prob) {
        cout << "Gunnar" << endl;
    } else if (gunnar_prob < emma_prob) {
        cout << "Emma" << endl;
    } else {
        cout << "Tie" << endl;
    } 
}
