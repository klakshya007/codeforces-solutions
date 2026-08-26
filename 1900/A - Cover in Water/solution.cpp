#include <iostream>
#include <string>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        string s;cin>>s;
        int count=0;
        for(int i=0;i<n;i++){
            if(s[i-1]=='.' && s[i]=='.' && s[i+1]=='.'){
                count=2;
                break;
            }
            else if (s[i]=='.')count+=1;
        }
        cout << count << "
";
    }
}