#include<iostream>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >>n;
    while(n--){
        int c;
        cin >>c;
        int flag=true;
        for(int i=1;i<=c;i++){
            int a;
            cin >> a;
            int x=i;
            while(x%2==0)x/=2;
            int y=a;
            while(y%2==0)y/=2;
            if(x!=y){
                flag=false;
            }
        }
        if (flag==true)cout<<"YES
";
        else cout << "NO
";
    }
}