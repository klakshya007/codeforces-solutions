#include <iostream>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n, k, x;
        cin >> n >> k >> x;
 
        if (x != 1) {
            cout << "YES
";
            cout << n << "
";
            for (int i = 0; i < n; i++)
                cout << 1 << " ";
            cout << "
";
        }
        else if (k == 1 || (k == 2 && n % 2 == 1)) {
            cout << "NO
";
        }
        else {
            cout << "YES
";
            cout << n / 2 << "
";
 
            if (n % 2 == 1)
                cout << 3 << " ";
            else
                cout << 2 << " ";
 
            for (int i = 1; i < n / 2; i++)
                cout << 2 << " ";
 
            cout << "
";
        }
    }
 
    return 0;
}