#include <iostream>
#include <vector>
using namespace std;
 
using ll= long long;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    ll t;
    cin>>t;
    while(t--){
        ll n;
        cin>>n;
        vector<ll>b(n);
        for(int i=0;i<n;i++){
            cin >>b[i];
        }
        vector<int> ans;
        ans.push_back(b[0]);
        for(int i=1;i<n;i++){
            if(b[i]>=b[i-1]){
                ans.push_back(b[i]);
            }
            else{
                ans.push_back(b[i]);
                ans.push_back(b[i]);
            }
        }
        cout <<ans.size()<<"
";
        for(ll x:ans){
            cout << x <<" ";
        }
        cout << "
";
    }
}