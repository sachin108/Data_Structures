#include<iostream>
#include<stack>
#include<string>
using namespace std;
stack<string> st;
void reverse();
void insert_At_bottom(string s);
int main(){
    st.push("C/C++");
    st.push("GoLang");
    st.push("Java");
    st.push("Python");
    st.push("Scala");
    st.push("Javascript");
    // at top before reversing - Javascript

    reverse();
    // after reversing stack at top
    string stack="";
    while(!(st.empty())){
        stack+=st.top()+"   ";
        st.pop();
    }
    cout<<stack;
    return 0;
}

void reverse(){
    if(!st.empty()){
        string x=st.top();
        st.pop();
        reverse();
        insert_At_bottom(x);
    }
}

void insert_At_bottom(string x){
    if(st.empty())
        st.push(x);
    else{
        string y=st.top();
        st.pop();
        insert_At_bottom(x);
        st.push(y);
    }
}