#include <iostream>
using namespace std;

int main(){
	char a[100]; int x = 0;
	cin>>a;
	for(int i = 0; i<100; i++){
		if(a[i]<64){
			int z = a[i] - '0';
			for(int j = x; j<i; j++){
				for(int k = 0; k<z; k++){
					cout<<a[j];
				}
			}
			x = i + 1;
		}
	}
}

