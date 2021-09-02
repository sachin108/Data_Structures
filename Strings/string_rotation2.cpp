#include<bits/stdc++.h>
using namespace std;
string left_Rotate(string str, int rotateBy);
string right_Rotate(string str, int rotateBy);
int main(){
	string str="Game of Thrones";
	cout<<left_Rotate(str,2)<<endl;
	cout<<right_Rotate(str,2);
	return 0;
}
string left_Rotate(string s, int rotateBy){
	return s.substr(rotateBy,s.size())+s.substr(0,rotateBy);	
}
string right_Rotate(string s, int rotateBy){
	return s.substr(s.size()-rotateBy)+s.substr(0,s.size()-rotateBy);
}
