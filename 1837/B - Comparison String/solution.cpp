#include<iostream>
#include <string>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int n;cin>>n;
    for(int i=0;i<n;i++){
        int m;cin>> m;
        string a;cin >>a;
        int count=1;
        int flag=1;
        for(int j=1;j<m;j++){
            if(a[j]==a[j-1]){
                flag++;
            }
            else {
                flag=1;
            }
            count = (count > flag) ? count : flag;
        }
        cout << ++count << "
";
    }
}