#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        long long k,n;
        cin >> n>>k;
        string s;cin>>s;
        bool ans=true;
        for(int r=0;r<k;r++){
            int ones=0;
            for(int i=r;i<n;i+=k){
                if(s[i]=='1')ones++;
            }
            if(ones&1)ans=false;
        }
        if(ans)cout<<"YES
";
        else cout<<"NO
";
    }
}