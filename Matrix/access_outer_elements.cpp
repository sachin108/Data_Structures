#include<bits/stdc++.h>
using namespace std;
int main(){
	int matrix[5][5]={{1,2,3,4,5},{4,5,6,7,8},{7,8,9,1,2},{1,2,3,4,5},{1,2,3,4,5}};
	int matrix_size=sizeof(matrix)/sizeof(matrix[0]);
	int matrix_row_size=sizeof(matrix[0])/sizeof(matrix[0][0]);
	for(int i=0;i<matrix_size;i++){
		for(int j=0;j<matrix_row_size;j++){
			if(i==0 || i==matrix_size-1){
				cout<<matrix[i][j];
			}
			else{
				if(j==0 || j==matrix_row_size-1){
					cout<<matrix[i][j];
				}
				else
					cout<<" ";
			}
			cout<<"  ";
		}
		cout<<endl;
	}
	return 0;
}
