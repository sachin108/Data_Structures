#include<bits/stdc++.h>
using namespace std;
int main(){
	int array[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
	int length=sizeof(array)/sizeof(array[0]);
	set<int> s;
	for(int i:array){
		s.insert(i);
	}
	
	for(int i=0;i<length;i++){
		if(s.find(i)!=s.end())
			array[i]=i;
		else
			array[i]=-1;
	}
	for(int i:array){
		cout<<i<<" ";
	}
	return 0;
}
