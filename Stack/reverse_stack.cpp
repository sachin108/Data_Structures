#include<bits/stdc++.h>
using namespace std;
void push_to_bottom(stack<int> &st, int value);
void reverse(stack<int> &st);
int main(){
	stack<int> st;
	int x;
	for(int i=1;i<6;i++){
		cin>>x;
		st.push(x);
	}

	reverse(st);
	while(!st.empty()){
		cout<<st.top();
		st.pop();
		if(!st.empty())
			cout<<"	";
	}
}
void reverse(stack<int> &st){
	if(st.empty())
		return;
	int item=st.top();
	st.pop();
	reverse(st);
	push_to_bottom(st,item);
}

void push_to_bottom(stack<int> &st, int value){
	if(st.empty()){
		st.push(value);
		return;
	}
	int x=st.top();
	st.pop();
	push_to_bottom(st,value);
	st.push(x);
}
