// Create a Java program that simply outputs the text "Hello World" when you run it. Call your main class "Application"

class Brain {
  public Brain() {
    System.out.println("Thinking...");
  }
}


class Person {
    private String name;

    private Brain brain;

    public Person() {
      System.out.println("Constructor running!");
    }


    public Person(String name) {
      brain = new Brain();
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String newName) {
      this.name = newName;
    }

    protected void writeName() {
      System.out.println("My name is " + this.name);
    }
}

public class Application {

  public static void main(String[] args) {

    System.out.println("Hello World");

    Person tommy = new Person("Tommy");

    String tommyName = tommy.getName();
    tommyName += " Morrison";

    tommy.setName(tommyName);

    tommy.writeName();

  }

}