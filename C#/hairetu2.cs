using System;
public class Hello{
    public static void Main(){
        string[] animal={"犬,猫,兎"};
        Console.WriteLine(animal[0]);
        Console.WriteLine(animal[1]);
        Console.WriteLine(animal[2]);

        int i;
        for(i=0;i<3;i++){
        Console.WriteLine(animal[i]);
        }
    }
}
