#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  cin>>p>>r>>t;
  float a=(p*r*t)/100;
  cout<<a<<endl<<p+a<<endl;
  float d=a*(2.0/100);
  cout<<d<<endl<<p+a-d;
  //Type your code here.
}