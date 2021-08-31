// search a key into an sorted and rotated array
#include<bits/stdc++.h>
int binarySearch(int array[], int key, int lower_bound, int upper_bound);
using namespace std;
int main(){
	int rotated_array[]={3,4,5,6,7,1,2};
	int rotation_Index=-1;
	int length_of_array=sizeof(rotated_array)/sizeof(rotated_array[0]);
	for(int i=1;i<length_of_array;++i){
		if(rotated_array[i]<rotated_array[i-1]){
			rotation_Index=i-1;
			break;
		}
	}
	int lower_bound,upper_bound,key=6;
	if(key==rotated_array[rotation_Index]){
		cout<<"element is at "<<rotation_Index;
		exit(0);
	}
	if(key>=rotated_array[0] && key<=rotated_array[rotation_Index])
		cout<<binarySearch(rotated_array,key,0,rotation_Index-1);
	else
		cout<<binarySearch(rotated_array,key,rotation_Index+1,length_of_array-1);
	return 0;
}
int binarySearch(int array[], int key, int lower_bound, int upper_bound){
	int middleIndex=lower_bound+(upper_bound-lower_bound)/2;
	if(array[middleIndex]==key)
		return middleIndex;
	if(key>array[middleIndex])
		return binarySearch(array,key,middleIndex+1,upper_bound);
	if(key<array[middleIndex])
		return binarySearch(array,key,lower_bound,middleIndex-1);
	else
		return -1;
}
