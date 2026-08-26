#include <iostream>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int a;cin >> a;
        if(a%3==0)cout<<"Second"<<"
";
        else cout << "First" <<"
";
    }
}