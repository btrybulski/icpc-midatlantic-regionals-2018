// wip
#include <bits/stdc++.h>
using namespace std;

#define rep(i,a,b) for(int i = a; i < b; i++)
#define trav(a,x) for(auto &a : x)

typedef pair<int,int> pii;
typedef vector<pii> vii;
typedef vector<int> vi;
typedef vector<vi> vvi;

int main() {
    int l, w, n, r, x, y;
    cin >> l >> w >> n >> r;

    pii lwc(-l/2,0); pii rwc(l/2,0);
    pii bwc(0,-w/2); pii twc(0,w/2);

    vii spots;
    rep(i,0,n) {
        cin >> x >> y; pii s(x,y);
        spots.push_back(s);
    }

    // 1..n spots to place a crane
    // 1 crane -> n spots 
    // 2 cranes -> n * n-1
    // 3 cranes -> n * n-2 * n-2
    // ...
    // n cranes -> n!
    // n <= 30, prob too slow on n=30 & imposs
    vvi paths;
    rep(i,0,n) {
        gen_paths(i,spots,paths);
        trav(a,paths) {
            
        } 
    }
}

void gen_paths(int i, vii& s, vvi& p) {}
double l2_dist(int x1, int y1, int x2, int y2) {}
