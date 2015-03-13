import java.util.*;

public class Animal {

  public static final double FAVNUMBER = 1.6180; // static means it is the same across instances of Animal class. I think in Ruby this is a class variable.

  private String name;
  private int weight;
  private boolean hasOwner = false;
  private byte age;
  private long uniqueID; // really big nums
  private char favoriteChar; // int that represents UTF-16 characters; character codes
  private double speed; // number with decimal; 64-bit
  private float height; // 32-bit num, decimal; less accurate as double


  protected static int numberOfAnimals = 0;
  // protected is accessed ONLY by other code in the package

  static Scanner userInput = new Scanner(System.in);
  // Scanner is a Java util library that allows you to take in user input from command line... sucks it doesnt have Ruby's #gets!

  public Animal () {
    numberOfAnimals++;

    int sumOfNumbers = 5 + 1;
    System.out.println("5 + 1 = " + sumOfNumbers);

    System.out.print("Enter the name: \n");

    if (userInput.hasNextLine()) { // hasNextLine method checks if the user input is a string. Similarly, there is hasNextInt, hasNextFloat, etc.
      this.setName(userInput.nextLine());


    }

    this.setFavoriteChar();
    this.setUniqueID();

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // in parenthesis, String is telling that the name variable is going to be a string
    this.name = name;
  }

  public int weight() {
    return weight;
  }

  public void setWeight(int weight) {
    // in parenthesis, String is telling that the name variable is going to be a string
    this.weight = weight;
  }

  public boolean hasOwner() {
    return hasOwner;
  }

  public void setHasOwner(boolean hasOwner) {
    // in parenthesis, String is telling that the name variable is going to be a string
    this.name = name;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    // in parenthesis, String is telling that the name variable is going to be a string
    this.age = age;
  }

  public long getUniqueID () {
    return uniqueID;
  }

  public void setUniqueID(byte uniqueID) {
    // in parenthesis, String is telling that the name variable is going to be a string
    this.uniqueID = uniqueID;
    System.out.println("Unique ID is set to: " + this.uniqueID);
  }

  public void setUniqueID() {
    long minNumber = 1;
    long maxNumber = 1000000;

    this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber)) + 1);
  }

  public char favoriteChar() {
    return favoriteChar;
  }

  public void setFavoriteChar(char favoriteChar) {
    this.favoriteChar = favoriteChar;
  }

  public void setFavoriteChar() {
    int randomNumber = (int) (Math.random() * 126) + 1;

    this.favoriteChar = (char) randomNumber;

    if (randomNumber == 32) {
      System.out.println("Favorite character set to space");
    }
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public float height() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public static void main(String[] args) {
    // this is the constructor!
    Animal theAnimal = new Animal();

  }

}