using System;
public class Hello{
    static void Main(){
        int [] num = new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        Console.WriteLine(num[0]+ num[1]+ num[2]);
    }
}

using System;
public class Hello{
    public static void Main(){
        int [] num1 ={10,20,30};
        int [] num2 ={-5,-10,-15};
        Array.Copy(num1,num2,1);
        Array.Sort(num2);
        Console.WriteLine(num2[0]);
    }
}
using System;
using System.Collections.Generic;
class Program {　　　　　　　　　　　　　　
   public static void Main (string[] args) {　　　　　　
    　 List <int> numbers =new List <int> {12,1,5,-2,16,14};
     　Console.WriteLine(numbers[3],numbers.Count); 
    }
}
