import java.util.*;

public class Calci {
  Scanner value = new Scanner(System.in);

  public void meterToFeet() {
    System.out.print("Enter the value in meters : ");
    double meter = value.nextDouble();
    System.out.println((meter * 3.28084) + " Feet");
  }

  public void celToFahrenheit() {
    System.out.print("Enter the value in Celcius : ");
    float celcius = value.nextFloat();
    float fahrenheit = celcius * (9 / 5) + 32;
    System.out.println("The temperature in fahrenheit is" + fahrenheit + "F");
  }

  public void bmi() {
    System.out.print("Enter your Height in Cms : ");
    float height = value.nextFloat();
    System.out.print("Enter your weight in Kgs : ");
    float weight = value.nextFloat();
    float bmi = (weight / height / height) * 10000;
    System.out.println("Your BMI is " + bmi);
    if (bmi < 18.5) {
      System.out.println("You are Under weight!");
    } else if (bmi >= 18.5 && bmi < 25) {
      System.out.println("You are Healthy Weight!");
    } else if (bmi >= 25 && bmi < 30) {
      System.out.println("You are Over weight!");
    } else if (bmi >= 30) {
      System.out.println("You are Obese!");
    }
  }

  public void simpleInterest() {
    System.out.print("Enter Principle Amount : ");
    int princ = value.nextInt();
    System.out.print("Enter the time in years : ");
    int time = value.nextInt();
    System.out.print("Enter the rate of interest : ");
    float rate = value.nextFloat();
    float interest = (princ * time * rate) / 100;
    System.out.println("Your Simple Interest is" + interest);
  }

  public void cutOff() {
    System.out.println("This calculates your 12th Grade Marks Cutoff!");
    System.out.print("Enter your marks in Maths : ");
    float math = value.nextFloat();
    System.out.print("Enter your marks in Physics: ");
    float phy = value.nextFloat();
    System.out.print("Enter your marks in Chemistry: ");
    float chem = value.nextFloat();
    float cut = math + (phy + chem) / 2;
    System.out.println("Your Cutoff is " + cut);
  }

  public static void Types() {
    Scanner Choose = new Scanner(System.in);
    Calci calculator = new Calci();
    System.out.println("1. Meter to Feet.");
    System.out.println("2. Celsius to Fahrenheit.");
    System.out.println("3. BMI.");
    System.out.println("4. Simple Interest.");
    System.out.println("5. 12th grade Cutoff.");
    System.out.print("Choose what you want to calculate : ");
    byte choice = Choose.nextByte();
    if (choice == 1) {
      calculator.meterToFeet();
    } else if (choice == 2) {
      calculator.celToFahrenheit();
    } else if (choice == 3) {
      calculator.bmi();
    } else if (choice == 4) {
      calculator.simpleInterest();
    } else if (choice == 5) {
      calculator.cutOff();
    } else {
      System.out.println("Invalid input!!");
    }
  }
}
