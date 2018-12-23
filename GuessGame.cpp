// @author Raghubir Chimni

#include <iostream>
int GuessGame()
{
  bool corr = false;
  int userNum;
  int randNum;
  randNum = rand() % 100 + 1; 
  while(corr ==  false)
  {
    std::cout<< "guess the number bruh ";
    std::cin>>userNum;
    if(randNum==userNum)
      corr=true;
    else
    {
      if(userNum>randNum)
        std::cout<<"guess lower bruh\n";
      else
        std::cout<<"guess higher bruh\n";
    }
  }
  if(corr == true)
    std::cout<< "good stuff man";
  else
    std::cout<< "youre bad";
}
