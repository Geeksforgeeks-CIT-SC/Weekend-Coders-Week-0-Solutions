#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    if(((stoi(s[0])^stoi(s[1]))%2)==0){
        cout<<"black";
    }else{
        cout<<"white";
    }
    return 0;
}