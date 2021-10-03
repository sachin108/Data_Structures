#include<bits/stdc++.h>
using namespace std;
int main(){
	int matrix[][3] = { {1, 2, 3}, {4, 5, 6}, {17, 8, 9} };
	int matrix_length = sizeof(matrix) / sizeof(matrix[0]);
	int first_diagonal_sum = 0;
	for(int i=0; i<matrix_length; i++){
		first_diagonal_sum += matrix[i][i];
	}
	cout<< first_diagonal_sum<< endl;
	int q=matrix_length, second_diagonal_sum=0;
	for(int i=0; i<matrix_length; i++)
		second_diagonal_sum += matrix[i][--q];
	cout<< second_diagonal_sum;
}