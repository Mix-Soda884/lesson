using System;
public class Hello{
    public static void Main(){
        // Your code here!
        int [] numbers={12,1,5,-2,16,14};
        Array.Sort(numbers);
        for(int i=0;i<numbers.Length;i++)
        {
            Console.WriteLine(numbers[i]);
        }
        Array.Reverse(numbers);
        foreach(int x in numbers){
            Console.WriteLine(x);
        }
    }
}

using System;
public class Hello{
    public static void Main(){
        string [] fruitu{"もも""みかん""ぶどう"}
        foreach(int x in fruitu){
            Console.WriteLine(x);
        }
    }
}

using System;
public class Hello{
    public static void Main(){
        List<int> userAgeList = new List<int> {11, 21, 31, 41};
        userAgeList.Add(51);
        userAgeList.Add(61);
        foreach(int x in userAgeList){
            Console.WriteLine(x);
        }
    }
}
