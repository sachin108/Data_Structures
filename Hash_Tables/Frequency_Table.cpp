#include<bits/stdc++.h>
using namespace std;
int main()
{
	vector<string> array;
	string x;
	for(int i=0;i<10;i++){
		cin>>x;
		array.push_back(x);
	}
	map<string, int> frequency_table;
	for(string i:array){
		++frequency_table[i];
	}
	for(auto x:frequency_table){
		cout<<x.first<<"	"<<x.second;
		cout<<endl;
	}
}