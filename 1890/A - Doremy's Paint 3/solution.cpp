#include <iostream>
#include <map>
using namespace std;
int main(){
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        map<int,int>mpp;
        for(int i=0;i<n;i++){
            int a;
            cin>>a;
            mpp[a]++;
        }
        if(mpp.size()>=3){
            cout << "No" <<"
";
            continue;
        }
        if(abs(mpp.begin()->second-mpp.rbegin()->second)<=1)cout <<"Yes"<<"
";
        else cout <<"No"<<"
";   
    }
}