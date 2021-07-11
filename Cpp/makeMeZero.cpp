#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int steps=0;
    while(n){
        if(n%2){
            n--;
        }else{
            n=n/2;
        }
        steps++;
    }
    cout<<steps;
    return 0;
}