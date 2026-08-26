#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int a;cin>>a;
        int od_count=0;
        while(a--){
            int b;cin>>b;
            if(b%2!=0)od_count++;
        }
        if(od_count%2==0)cout <<"YES
";
        else cout<<"NO
";
    }
    return 0;
}