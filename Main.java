import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Person> al = new ArrayList<Person>();
    
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
        myFile = new FileWriter"questions.txt");
        BufferedWriter reader = new BufferedWriter(myFile);

        while (reader.ready()) 
          for(int i = 0; i<al.size(); i++){
            reader.writeLine(al.get(i).getName());
          }

        reader.close();
      }
    catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }
  }
}