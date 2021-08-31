#include<bits/stdc++.h>
int*  reversal_Algo(int array[],int rotation_Index,int size_of_array);
void reverse_array(int array[],int begin,int end);
using namespace std;
int main(){
	int array[]={1,2,3,4,5,6,7,8,9};
	int rotate_by=3,size_of_array=sizeof(array)/sizeof(array[0]);
	--size_of_array;
	int rotation_Index=size_of_array-rotate_by;
	int *ptr;
	ptr=reversal_Algo(array,rotation_Index,size_of_array);
	for(int i=0;i<size_of_array;i++){
		cout<<ptr[i]<<"	";
	}
	return 0;
}
int*  reversal_Algo(int array[],int rotation_Index,int size_of_array){
	reverse_array(array,0,rotation_Index);
	reverse_array(array,rotation_Index+1,size_of_array);
	reverse_array(array,0,size_of_array);
	return array;
}

void reverse_array(int array[],int begin,int end){
	while(begin<end){
		int temp=array[begin];
		array[begin]=array[end];
		array[end]=temp;
		begin++;
		end--;
	}
}
