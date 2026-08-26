#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n,a=0,b=0;cin>>n;
        //a = -1 count, b= 1 count
        while(n--){
            int c;cin>>c;
            c==(-1)?a++:b++;
        }
        int count=0;
        //even
        if(a&1==1){
            count++;
            a--;
            b++;
        }
        while(a>b){
            a-=2;
            b+=2;
            count+=2;
        }
        cout << count << "
";
    }
}