using System;
public class Hello{
    public static void Main(){
        int x,v;
        int y = 0;
        int i = 0;
        Console.WriteLine("整数を入力してください");
        x = int.Parse(Console.ReadLine());
        if(x%2==0)
        {
            for(v=0;v<=x;v=v+1){
                y += v;
                Console.WriteLine(y);
            }
       }
       else if(x%2==1)
       {
        for(v=0;v<=x;v=v+2){
                i += v;
                Console.WriteLine(i);
            }
       }
    }
}
