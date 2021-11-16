import java.util.ArrayList;
import java.io.*; 

class Main {
  public static void main(String[] args){ 
  ArrayList<Person> people = new ArrayList<Person>();

    Person p1 = new Person("Parker", 21, "vermillion");
    Person p2 = new Person("A", 87, "pink");
    Person p3 = new Person("B", 13, "yellow");
    Person p4 = new Person("C", 55, "black");
    Person p5 = new Person("D", 4, "green");

    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);
    people.add(p5);

  try {
   FileWriter myFile = new FileWriter("data.txt"); 
   BufferedWriter writer = new BufferedWriter(myFile);
   
    for(int i = 0; i<people.size(); i++){
      Person object = people.get(i);
      writer.write(object.name);
      writer.newLine();
      writer.write(Integer.toString(object.age));
      writer.newLine();
      writer.write(object.color);
      writer.newLine();
    }
   writer.flush();
   writer.close();
  }
  catch (IOException e){
    System.out.println("An error occured: " + e);
  }
  try {
    FileReader myFile = new FileReader("data.txt");
    BufferedReader reader = new BufferedReader(myFile);

    while (reader.ready()){
      String name = reader.readLine();
      int age = Integer.parseInt(reader.readLine());
      String color = reader.readLine();
    }
    reader.close();
  }
  catch (IOException exception){
    System.out.println("An error occured: " + exception);
  }
  
  for(int i = 0; i <people.size(); i++){
    Person object = people.get(i);
    System.out.printf("%-10s %-10s %-10s %n", object.name, object.age, object.color);
  }
  }
}