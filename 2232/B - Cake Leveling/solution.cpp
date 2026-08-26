#include <iostream>
#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int a;
    cin >> a;
    for(int i=0;i<a;i++){
        int n;
        cin>>n;
        vector<long long>vec(n);
        long long sum=0;
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        int firstNum=0;
        int secondNum=0;
        long long best = (long long)4e18;
        for(int i=0;i<n;i++){
            sum+=vec[i];
            best = min(best, sum / (i + 1));
 
            cout << best;
            if (i + 1 < n) cout << " ";
        }
        cout << "
";
    }
}