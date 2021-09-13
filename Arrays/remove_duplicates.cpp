#include<bits/stdc++.h>
using namespace std;
int main(){
	int array[]={0,0,1,1,1,2,2,3,3,4};
	int length_of_array=sizeof(array)/sizeof(array[0]);
	int number_of_distinct_elements=1;
	int left_pointer=array[0];
	for(int i=1;i<length_of_array;i++){
		if(left_pointer==array[i]){
			array[i]=INT_MAX;
		}
		else{
			++number_of_distinct_elements;
			left_pointer=array[i];
		}
	}
	sort(array,array+length_of_array);
	for(int i=0;i<number_of_distinct_elements;i++)
		cout<<array[i]<<"	";
	return 0;
}