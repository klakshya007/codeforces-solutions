#include <iostream>
#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int a;
    cin >> a;
    for(int i=0;i<a;i++){
        int n;
        cin>>n;
        vector<int>vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        sort(vec.begin(),vec.end());
        int ans=n;
        for(int i=0;i<n;){
            int j=i;
            while(j<n && vec[j]==vec[i])j++;
            
            int left=i;
            int freq=j-i;
            int right =n-left-freq;
 
            ans=min(ans,max(left,right));
            i=j;
        }
        cout << ans << "
";
    }
}