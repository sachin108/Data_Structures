/*Given an array of positive integers. We need to make the given array a ‘Palindrome’. 
The only allowed operation is”merging” (of two adjacent elements). Merging two adjacent
elements means replacing them with their sum. The task is to find the minimum number of 
merge operations required to make the given array a ‘Palindrome*/
#include<iostream>
#include<vector>
using namespace std;
int count_operations(vector<int> v, int size);
int main(){
    vector<int> Array={6, 1, 4, 3, 1, 7};
    cout<<"Number of operations required to make an array palindrome "<<count_operations(Array, Array.size());
    return 0;
}
int count_operations(vector<int> v, int size){
    int count=0;
    int i=0, j=size-1;
    while(j>i){
        if(v[i]<v[j]){
            v[i+1]+=v[i];
           // v[i]=0;
            i++; ++count;
        }   
        else if(v[i]>v[j]){
            v[j-1]+=v[j];
            //v[j]=0;;
            j--; ++count;
        }
        else{
            i++; j--;
        }
    }
    return count;
}
// not valid for every array