import java.util.*;                              
public class JavaBasics                                     
{                            
    public static void main(String[] args)                           
    {            
        int a = 10;     //initialising           
        String name = "Saksham";         
        boolean var = true;      
  
        System.out.println("HI");      //new line      
        System.out.print("HI\n");
        System.out.print("HI"); 

        Scanner sc = new Scanner(System.in);       //taking input
        String input = sc.next();
        String input2 = sc.nextLine();
        
        int a = 10;        //output
        int b = 10;
        System.out.println("add=" + (a+b)); \\ syntax is imp
        
    }
    
}


//Assignment-1
class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int rev=0, sum=0, X=N;
        
        while (X>0) {
            sum += X%10;
            X /= 10;
        }
        
        X = sum;
        while (X>0) {
            rev = rev*10 + X%10;
            X /= 10;
        }
        
        if (rev==sum) {
            return 1;
        }
        else {
            return 0;
        }
    }
}


//2
import java.util.*;

public class Q_12 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter first number : ");
      int x = sc.nextInt();
      
      System.out.print("Please enter second number : ");
      int y = sc.nextInt();
      
      System.out.print("Please enter third number : ");
      int z = sc.nextInt();
      
      if (isTriplet(x, y, z)) {
          System.out.println("The given numbers are Pythagorean Triplet.");
      }
      else {
          System.out.println("The given numbers are not Pythagorean Triplet.");
      }
    }
    public static Boolean isTriplet(int x, int y, int z) {
        int a = x*x;
        int b = y*y;
        int c = z*z;
        
        if (a == b + c || b == a + c || c == a + b) {
            return true;
        }
        else {
            return false;
    }
    }
}

//3
import java.util.*;

public class Q_13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
      
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        
        System.out.print("The prime numbers are : ");
      
        for (int i=num1; i<=num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        else {
            for (int i=2; i<num; i++) {
                if (num%i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

//4
import java.util.*;

public class Q_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        System.out.print("The sum of " + num + " natural numbers are " + sum(num));
    }
    
    public static int sum(int num) {
        int T=0;
        for (int i=0; i<=num; i++) {
            T += i;
        }
        return T;
    }
}

//5
import java.util.*;

public class Q_2 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      
      if (isEven(num)) {
          System.out.println("The given number is an Even Number");
      }
      else {
          System.out.println("The given number is an Odd Number");
      }
      
    }
    
    public static Boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

//6
import java.util.*;

public class Q_3 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age : ");
      int num = sc.nextInt();
      
      if (isEligible(num)) {
          System.out.println("You are eligible for vote!");
      }
      else {
          System.out.println("Sorry, you're not eligible for vote!");
      }
      
    }
    
    public static Boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}

//7
import java.util.*;

public class Q_7 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      
      if (isPrime(num)) {
          System.out.println("The given number is Prime");
      }
      else {
          System.out.println("The given number is not Prime");
      }
      
      
    }
    
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        else {
            for (int i=2; i<num; i++) {
                if (num%i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

//8
import java.util.*;

public class Q_9 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number : ");
      int num = sc.nextInt();
      int factorial = fact(num);
      System.out.println("The factorial of given number is " + factorial);
    }
    public static int fact(int num) {
        int product = 1;
        if (num==0 || num==1) {
            return 1;
        }
        for (int i=1; i<=num; i++) {
            product *= i;
        }
        return product;
    }
}

//9
package hashMapImplementation;
import java.util.HashMap;
public class ExtractUniqueCharacters {
	public static String uniqueChar(String str){
	if(str.length()==0) {
		return "";
	}
	String ans = "";
	HashMap<Character, Boolean> map = new HashMap<>();
	for(int currentIndex=0;currentIndex<str.length();currentIndex++) {
		char currentChar = str.charAt(currentIndex);
		if(!map.containsKey(currentChar)) {
			map.put(currentChar, true);
			ans += currentChar;
		}
	}
	return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ababacd";
		String str2 = "abcde";
		System.out.println(uniqueChar(str1));
		System.out.println(uniqueChar(str2));
		//abcd are the respective outputs
		//abcde

	}

	//10
	package hashMapImplementation;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class LongestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr)
	{
       Map<Integer, Boolean> visitedElements = new HashMap<>();
       Map<Integer, Integer> elementToIndexMapping = new HashMap<>();
       for(int i=0;i<arr.length;i++) {
    	   int num = arr[i];
    	   elementToIndexMapping.put(num, i);
    	   if(!visitedElements.containsKey(num)) {
    		   visitedElements.put(num, false);
    	   }
       }
       ArrayList<Integer> longestSequence = new ArrayList<>();
       int globalMaxSequenceLength = 1;
       int globalMinStartIndex = 0;
       for(int i=0;i<arr.length;i++) {
    	   int num = arr[i];
    	   int currentMinStartIndex = i;
    	   int count = 0;
    	   int tempNum = num;
    	   //forward
    	   while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
    		   visitedElements.put(tempNum, true); //mark visited elements in the arary as true
    		   count++;
    		   tempNum++;
    	   }

