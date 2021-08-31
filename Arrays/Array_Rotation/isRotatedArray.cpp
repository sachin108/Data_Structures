// given a array A convert it into string S and then concatenate S with S (S+=S , let's say newS), 
// if rotated Array A2(converted to string) is present in newS then A2 is rotation of A
#include<bits/stdc++.h>
using namespace std;
int main(){
	int array[]={1,2,3,4,5,6,7};
	int rotated_array[]={4,5,6,7,1,2,3};
	string originalArrayString="";
	for(auto i:array){
		originalArrayString+=i;
	}
	originalArrayString+=originalArrayString;
	
	string rotatedArrayString="";
	for(auto i:rotated_array){
		rotatedArrayString+=i;
	}
	
	int indexOf_rotatedArray_String=0;
	int sizeOf_rotatedArray_string=rotatedArrayString.size();
	for(int i=0;i<originalArrayString.size();i++){
		if(indexOf_rotatedArray_String==sizeOf_rotatedArray_string-1){
			cout<<"YES!!";
			exit(0);
		}
		if(originalArrayString[i]==rotatedArrayString[indexOf_rotatedArray_String]){
			++indexOf_rotatedArray_String;
		}
		else{
			indexOf_rotatedArray_String=0;
		}
	}
	
	return 0;
}
