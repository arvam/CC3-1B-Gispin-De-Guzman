package classesandobjects;
import java.util.Scanner;
public class ClassesAndObjects
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
       
        //import java.util.Scanner;
        //Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        //int i = scan.nextInt();
       
        //Scanner reader = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Enter a number: ");
        //int n = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        //reader.close()
           
        System.out.println("Enter Dog 1");
        //name
        System.out.print("Enter Dog's name: ");
        String Dog = scan.next();
        Dog Name = new Dog();
        //Name.setname("Vamvam");
        String dogVam = Name.getname();
        //System.out.println("The Dog's name is " + Dog);
        //age
        System.out.print("Enter Dog's Age: ");
        int age  = reader.nextInt();
        Dog Age = new Dog();
        //Age.setage(10);
        int dogAge = Age.getage();
        //System.out.println("The Dog's age is " + dogAge);
        //breed
        System.out.print("Enter Dog's Breed: ");
        String breed = scan.next();
        Dog Breed = new Dog();
        //Breed.setbreed("Husky");
        String dogBreed = Breed.getbreed();
        //System.out.println("The Dog's breed is " + dogBreed);
        //gender
        System.out.print("Enter Dog's Gender: ");
        char s = sc.next().charAt(0);
        Dog Gender = new Dog();
        //Gender.setgender('M');
        char dogGender = Gender.getgender();
        //System.out.println("The Dog's gender is " + dogGender);
       
      
       
       
        System.out.println("Enter Dog 2");
        //name
        System.out.print("Enter Dog's name: ");
        String Cardo = scan.next();
       
        System.out.print("Enter Dog's Age: ");
        int x  = reader.nextInt();
      
        System.out.print("Enter Dog's Breed: ");
        String cardo = scan.next();
     
        System.out.print("Enter Dog's Gender: ");
        char z = sc.next().charAt(0);
       
        System.out.println("============================");
       
       
        System.out.println("Dog Bantay");
        System.out.println("Name: " +  Dog);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Gender: " + s);
       
        System.out.println();
       
       
         System.out.println("Dog Cardo");
        System.out.println("Name: " +  Cardo);
        System.out.println("Age: " +  x);
        System.out.println("Breed: " + cardo);
        System.out.println("Gender: " + z);
       
       
     
       
   
      
    }
   
}