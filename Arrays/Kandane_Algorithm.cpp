#include<bits/stdc++.h>
int kandane_algo(int array[],int n);
using namespace std;
int main(){
	int array[]={5, 7, -3, 2, 9, 6, 16, 22, 21, 29, -54, 10, 12};
	int length_of_array=sizeof(array)/sizeof(array[0]);
	kandane_algo(array,length_of_array);
	return 0;
}
int kandane_algo(int array[],int length_of_array){
	int current_sum=array[0],best_sum=array[0];
	for(int i=1;i<length_of_array;i++){
		if(current_sum>=0)
			current_sum+=array[i];
		else
			current_sum=array[i];
		if(current_sum>best_sum)
			best_sum=current_sum;
	}
	cout<<best_sum;
	return 0;
}
