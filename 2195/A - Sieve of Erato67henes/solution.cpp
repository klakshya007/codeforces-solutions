#include <iostream>
#include <vector>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    while(n--){
        int c;
        cin >> c;
        bool flag=false;
        for(int i=0;i<c;i++){
            int a;
            cin >>a;
            if(a==67)flag=true;
        }
        if(flag==true){
            cout << "YES
";
        }
        else{
            cout << "NO
";
        }
    }
}