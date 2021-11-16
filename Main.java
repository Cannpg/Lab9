import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Person> al = new ArrayList<Person>();
    ArrayList<Person> people = new ArrayList<Person>();
    
    Person p1 = new Person("Parker", 21, "Vermillion");
    Person p2 = new Person("A", 87, "Pink");
    Person p3 = new Person("B", 13, "Yellow");
    Person p4 = new Person("C", 55, "Black");
    Person p5 = new Person("D", 4, "Green");

    al.add(p1);
    al.add(p2);
    al.add(p3);
    al.add(p4);
    al.add(p5);

    try{
        FileWriter myFile;
        myFile = new FileWriter("questions.txt");
        BufferedWriter writer = new BufferedWriter(myFile);

        for(int i = 0; i<al.size(); i++){
            writer.write(al.get(i).getName());
          writer.newLine();
            writer.write(Integer.toString(al.get(i).getAge()));
          writer.newLine();
            writer.write(al.get(i).getColor());
          writer.newLine();
        }

      writer.flush();
      }
    catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }

    try{
        FileReader myFile;
        myFile = new FileReader("data.txt");
        BufferedReader reader = new BufferedReader(myFile);

        while (reader.ready()) {
          String name = reader.readLine();
          int age = Integer.parseInt(reader.readLine());
          String color = reader.readLine();

          Person p = new Person(name, age, color);

          people.add(p);
        }

        reader.close();
      }
    catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }

    for(int i = 0; i < people.size(); i++){
      Person object = people.get(i);
      System.out.printf("'%-10s' %n", object.name, object.age, object.color);
    }
  }
}