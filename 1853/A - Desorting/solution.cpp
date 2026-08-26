#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        int min_diff=INT_MAX;
        int prev;cin>>prev;
        bool sorted=true;
        for(int i=1;i<n;i++){
            int a;cin>>a;
            if(a<prev)sorted=false;
            int curr_diff=abs(prev-a);
            if(curr_diff<min_diff)min_diff=curr_diff;
            prev=a;
        }
        if(!sorted){
            cout << 0<<"
";
        }
        else {
            cout << (min_diff/2)+1<<"
";
        }
    }
    return 0;
}