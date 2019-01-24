#include <algorithm>
#include <iostream>

using namespace std;

long longSqrt(long N) {
    if (N <= 1) {
        return N;
    }
    long maxSqrt = 1;
    while (maxSqrt * maxSqrt <= N) {
        maxSqrt = maxSqrt * 2;
    }
    long minSqrt = maxSqrt / 2;
    while (minSqrt < maxSqrt) {
        long mid = (minSqrt + maxSqrt) / 2;
        long sqr = mid * mid;
        if (sqr == N) {
            return mid;
        } else if (sqr < N) {
            minSqrt = mid + 1;
        } else {
            maxSqrt = mid;
        }
    }
    return minSqrt - 1;
}

long tightlyPacked(long N) {
    long best = 100000;
    long stop = longSqrt(N) + 1;
    long start = max(1L, 7 * (stop - 1) / 10);

    for (int h = start; h < stop; h++) {
        long W = N / h;
        if (2 * h >= W) {
            if (h * W == N) {
                best = 0;
                break;
            } else {
                W++;
                if (2 * h >= W) {
                    long size = h * W;
                    best = min(best, size - N);
                }
            }
        }
    }
    return best;
}

int main() {
    long N;
    cin >> N;
    cout << tightlyPacked(N);
}