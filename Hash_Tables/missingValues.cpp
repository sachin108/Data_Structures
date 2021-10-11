#include<iostream>
#include<map>
#include<vector>
#include<array>
#include<algorithm>
using namespace std;
vector<int> missing(int low, int high, int array[]);
int main() {
    int array[]={10,12,17,20,14,16,18};
    int low=10, high=20;
    vector<int> v=missing(low, high, array);
    cout<<"mis";
    return 0;
}

vector<int> missing(int low, int high, int array[]){
    vector<int> v;
    map<int, int> m;
    int size=sizeof(array)/sizeof(array[0]);
    for(int i=0;i<size;i++){
        ++m[array[i]];
    }
    for(int i=low; i<=high; i++){
        if(m.find(i)==m.end){
            v.push_back(i);
        }
    }
    return v;
}