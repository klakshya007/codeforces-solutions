#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        int max_h=INT_MIN;
        int min_h=INT_MAX;
        while(n--){
            int a;cin>>a;
            if(a>max_h)max_h=a;
            if(a<min_h)min_h=a;
        }
        int diff=max_h-min_h+1;
        cout<<diff<<"
";
    }
}