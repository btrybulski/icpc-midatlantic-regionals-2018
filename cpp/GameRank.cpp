#include <bits/stdc++.h>
using namespace std;

#define print(str) (cout << str << endl)

int ranking = 25, stars = 0, conseqWins = 0;

int rankingStars() {
    if (ranking >= 21) return 2;
    if (ranking >= 16) return 3;
    if (ranking >= 11) return 4;
    if (ranking >= 1) return 5;
    if (ranking == 0) return -1;
}

void win() {
    if (ranking == 0) return;
    conseqWins++;
    int reward = (conseqWins > 2 && ranking >= 6) ? 2 : 1;
    int distToRank = rankingStars() - stars;
    if (distToRank < reward) {
        ranking--;
        stars = reward - distToRank;
    } else {
        stars += reward;
    }
}

void lose() {
    conseqWins = 0;
    if (ranking == 0) return;
    if (ranking > 20) return;
    if (ranking == 20 && stars == 0) return;
    if (stars == 0) {
        ranking++;
        stars = rankingStars() - 1;
        return;
    }  
    stars--;
}


int main() {
    string history;
    getline(cin, history);
    for (auto &c : history) {
        if (c == 'W') {
            win();
        } else {
            lose();
        }
    }
    (ranking == 0) ? print("Legend") : print(ranking);
}
