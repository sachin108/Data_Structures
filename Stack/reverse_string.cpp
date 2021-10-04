#include<iostream>
#include<stack>
#include<string>
using namespace std;
int main(){
    string name="kratS draddE droL";
    stack<char> st;
    for(char i:name)
        st.push(i);
    
    char c='1';
    while(!st.empty()){
        c=st.top();
        st.pop();
        cout<<c;
    }
    return 0;
}