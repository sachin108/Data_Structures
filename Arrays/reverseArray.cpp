#include<bits/stdc++.h>
int * juggLing_algo(int array[],int number_of_sets);
int Euclidean_Algo(int a,int b);
using namespace std;
int main(){
	int array[]={1,2,3,4,5,6,7,8,9};
	int size_of_array=*(&array+1)-array-1,begin=0;
	while(size_of_array>begin){
		int temp=array[begin];
		array[begin]=array[size_of_array];
		array[size_of_array]=temp;
		size_of_array--;
		begin++;
	}
	for(int i:array){
		cout<<i<<"	";
	}
	return 0;
}
