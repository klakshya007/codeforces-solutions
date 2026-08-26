#include <iostream>
#include <vector>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n,k;
        cin >> n >>k;
        int flag=1,b=INT_MIN;
        while(n--){
            int a;cin>>a;
            if(a<b)flag=0;
            b=a;
        }
        if(k>=2 || flag==1)cout <<"YES"<<"
";
        else cout << "NO" << "
";
    }
}