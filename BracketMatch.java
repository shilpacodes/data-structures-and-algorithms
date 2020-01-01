import java.io.*;
import java.util.*;

class Solution {
  
  static int bracketMatch(String text) {
    // your code goes here
    int countO = 0;
    int temp = 0;
    for(int i = 0; i < text.length(); i++){
      if(text.charAt(i) == '('){
        countO++; 
      }
      else if(text.charAt(i) == ')' && countO == 0){
        temp++;
      }
      else if(text.charAt(i) == ')'){
        countO--;
      }

    }
    return countO + temp;
  }

  public static void main(String[] args) {

  }

}
