#include<bits/stdc++.h>
int * juggLing_algo(int array[],int number_of_sets);
int Euclidean_Algo(int a,int b);
using namespace std;
int main(){
	int array[][3]={{1,2,3},{4,5,6},{7,8,9}};
	cout<<"before rotating it by 90 degree\n";
	for(auto& rows:array){
		for(int k:rows){
			cout<<k<<" ";
		}
		cout<<endl;
	}
	cout<<"after rotating array by 90 degree\n";
	for(int i=0;i<3;i++){
		for(int j=2;j>=0;j--){
			cout<<array[j][i]<<" ";
		}
		cout<<endl;
	}
}
