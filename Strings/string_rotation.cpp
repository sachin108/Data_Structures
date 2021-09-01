//Lexicographically minimum string rotation
#include<bits/stdc++.h>
using namespace std;
int main(){
	string s="clashofkings";
	int strLen=s.size();
	s+=s;
	string array[strLen];
	for(int i=0;i<strLen;i++){
		array[i]=s.substr(i,i+strLen);
	}
	sort(array,array+strLen);
	cout<<array[0];
	return 0;
}
