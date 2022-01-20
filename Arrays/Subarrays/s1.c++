/*
    divide an array into 2 subarrays such that one array has 
    all the elements strictly greater than all the elements of other subarray
*/
#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cin>>n;
    int array[n];
    for(int i=0;i<n;i++){
        cin>>array[i];
    }
    sort(array, array+n);
    int h=n/2;
    int x=h;
    vector<int> vR, vL;
    for(int i=0;i<x;i++){
        if(array[i]<array[h]){
            vL.push_back(array[i]);
            vR.push_back(array[h++]);
        }
    }
    if(vL.size()==0){
        cout<<"Impossible";
        return 0;
    }
    while(h<n){
        vR.push_back(array[h++]);        
    }
    cout<<"right subarray";
    for(int i:vR){
        cout<<i<<"  ";
    }
    cout<<endl<<"left subarray";
    for(int i:vL){
        cout<<i<<"  ";
    }    
    return 0;
}
