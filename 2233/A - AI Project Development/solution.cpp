#include <iostream>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        long long n,x,y,z;
        cin >>n>>x>>y>>z;
        long long t1 = (n+x+y-1)/(x+y);
        long long t2=0;
 
        if(x*z>=n)t2=(n+x-1)/x;
        else{
            long long remain=n-x*z;
            long long ai_speed=x+10*y;
            t2=z+(remain+ai_speed-1)/ai_speed;
        }
        cout <<min(t1,t2)<<"
";
    }
}