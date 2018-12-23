// @author Raghubir Chimni
#include <iostream>
int pancakeMost()
{
int person[10];
int person1;
int max = 0 , min = 100;
int mid;

for(int i =0; i<10; i++){
  
std::cout<<"enter in pancakes for person " << (i+1) << "";
std::cin>> person1;
person[i] = person1;
}

for(int k = 0; k<10; k++)
{
  if(person[k]>max){
    mid = k;
    max = person[k];
  }
  if(person[k]<min)
    min = person[k];
}
std::cout<<"Person " << mid << "\n";
//::cout<<min;


return 0;
}
