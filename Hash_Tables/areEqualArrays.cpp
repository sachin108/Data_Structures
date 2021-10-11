#include<iostream>
#include<map>
using namespace std;
int main() {
    int first_array[]={1,2,3,4,5,6,7,1,2,3};
    int size=sizeof(first_array)/sizeof(first_array[0]);

    int second_array[]={7,1,3,4,2,5,6,1,2,3};
    int size2=sizeof(second_array)/sizeof(second_array[0]);

    if(size!=size2){
        cout<<"Arrays aren't same";
        return 0;
    }

    map<int, int> m;
    for(int i:first_array){
        ++m[i];
    }
    
    for(int i=0;i<size2;i++){
        if(!(m.find(second_array[i])==m.end())){
            if(m[second_array[i]]!=0)
                --m[second_array[i]];
        else{
            cout<<"Arrays aren't same";
            return 0;
            }
        }

        else{
            cout<<"Arrays aren't same";
            return 0;
            }
    }

    cout<<"Arrays are same";
    return 0;
}