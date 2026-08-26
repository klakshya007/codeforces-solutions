#include <iostream>
#include <vector>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        long long x,k,n;
        cin >> x >> k;
        vector<int>vec;
        if(x%k!=0){
            n=1;
            vec.push_back(x);
        }
        else {
            n=2;
            vec.push_back(x-1);
            vec.push_back(1);
        }
        cout << n <<"
";
        for(auto i:vec)cout << i <<" ";
        cout << "
";
    }
}