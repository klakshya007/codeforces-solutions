#include <iostream>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >>t;
    int min_num = INT_MAX;
    while(t--){
        int a;cin>>a;
        a=abs(a);
        if(a==0){
            min_num=0;
            break;
        }
        if (min_num>a)min_num=a;
    }
    cout << min_num;
}