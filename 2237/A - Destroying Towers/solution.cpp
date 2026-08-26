#include <iostream>
using namespace std;
 
int main(){
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        int sum=0;
        int prev=INT_MAX;
        for(int i=0;i<n;i++){
            int a;cin>>a;
            prev=min(prev,a);
            sum+=prev;
        }
        cout << sum <<"
";
    }
}