#include<bits/stdc++.h>
using namespace std;
int main(){
	int array[]={0,2,1,0,0,1,25,6,7,3,0,0,12};
	int sizeof_array=sizeof(array)/sizeof(array[0]);
	int l_ptr=0;
	for(int i=0;i<sizeof_array;++i){
		if(array[i]!=0){
			//swapping
			array[i]=array[i]^array[l_ptr];
			array[l_ptr]=array[i]^array[l_ptr];
			array[i]=array[i]^array[l_ptr];
			++l_ptr;
		}
	}
	for(int i:array)
		cout<<i<<", ";
	return 0;
}
