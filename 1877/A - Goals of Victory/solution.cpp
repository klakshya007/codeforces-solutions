#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int eff=0;
        int n;cin>>n;
        --n;
        while(n--){
            int a;cin>>a;
            eff+=a;
        }
        cout <<0-eff<<"
";
    }
}