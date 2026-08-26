#include <iostream>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n;cin>>n;n=n-1;
        int first;cin>>first;
        int second;
        while(n--)cin >> second;
        first==1?cout << "YES" <<"
":cout << "NO" <<"
";
    }
}