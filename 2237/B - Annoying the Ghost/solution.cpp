#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int T;
    cin >> T;
 
    while (T--) {
        int n;
        cin >> n;
 
        vector<long long> a(n), b(n);
 
        for (int i = 0; i < n; i++) cin >> a[i];
        for (int i = 0; i < n; i++) cin >> b[i];
 
        vector<int> m(n);
        bool ok = true;
 
        for (int i = 0; i < n; i++) {
            auto it = lower_bound(b.begin(), b.end(), a[i]);
 
            if (it == b.end()) {
                ok = false;
                break;
            }
 
            m[i] = (it - b.begin()) + 1; // 1-based
        }
 
        if (!ok) {
            cout << -1 << '
';
            continue;
        }
 
        vector<vector<int>> start(n + 2);
 
        for (int i = 0; i < n; i++) {
            start[m[i]].push_back(i + 1); // original index
        }
 
        priority_queue<int, vector<int>, greater<int>> pq;
        vector<int> order;
 
        for (int pos = 1; pos <= n; pos++) {
            for (int idx : start[pos])
                pq.push(idx);
 
            if (pq.empty()) {
                ok = false;
                break;
            }
 
            order.push_back(pq.top());
            pq.pop();
        }
 
        if (!ok) {
            cout << -1 << '
';
            continue;
        }
 
        vector<int> finalPos(n + 1);
 
        for (int pos = 0; pos < n; pos++) {
            finalPos[order[pos]] = pos + 1;
        }
 
        long long ans = 0;
 
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (finalPos[i] > finalPos[j]) ans++;
            }
        }
 
        cout << ans << '
';
    }
 
    return 0;
}