using System;

namespace ConsoleApp4
{
    class Program
    {
        private static void Main(string[] args)
        {
            // while loop = repeat code while some condition remains true
            Console.Write("Enter your name: ");
            String name = Console.ReadLine();

            while (name == "")
            {
                Console.Write("Enter your name: ");
                name = Console.ReadLine();
            }

            Console.Write("Hello " + name);
            Console.ReadKey();
        }
    }
}