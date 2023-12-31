package Polymorphism;

public class Demo {

        int a, b, c;

        public void add(int x, int y)
        {
            a = x;
            b = y;
            System.out.println("addition of a+b is:" + (a + b));
        }

        public void add(int x, int y, int z)
        {
            a = x;
            b = y;
            c = z;
            System.out.println("addition of a+b+c is:" + (a + b + c));
        }

        public void print()
        {
            System.out.println("Class A's method is running");
        }
    }

    class Demo1 extends Demo {
        public void print()
        {
            super.print();
            System.out.println("Class B's method is running");
        }

        // Driver Code
        public static void main(String[] args)
        {
            Demo a1 = new Demo();

            // method overloading (Compile-time polymorphism)
            a1.add(6, 5);

            // method overloading (Compile-time polymorphism)
            a1.add(1, 2, 3);

            Demo1 b1 = new Demo1();

            // Method overriding (Run-time polymorphism)
            b1.print();
        }
    }


