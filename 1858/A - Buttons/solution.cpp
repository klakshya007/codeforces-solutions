#include <iostream>
 
using namespace std;
using ll = long long;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    ll t;cin>>t;
    while(t--){
        ll a,b,c;
        cin >> a >>b>>c;
        if (c%2==0){
            if (a>b)cout << "First
";
            else cout << "Second
";
        }
        else {
            if(b>a)cout << "Second
";
            else cout << "First
";
        }
    }
}