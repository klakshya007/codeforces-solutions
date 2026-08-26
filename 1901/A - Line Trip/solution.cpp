#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin >> t;
    while(t--){
        int n,k;cin>>n>>k;
        int max_diff=0,b=0;
        while(n--){
            int a;cin>>a;
            if(a-b>max_diff)max_diff=a-b;
            b=a;
        }
        int last_diff=k-b;
        cout << max(max_diff,2*last_diff) <<"
";
    }
}