class Person{
  String name;
  int age;
  String color;

  Person(String newName, int newAge, String newColor){
    newName = name;
    newAge = age;
    newColor = color;
  }

  String getName(){
    return name;
  }

  int getAge(){
    return age;
  }

  String getColor(){
    return color;
  }
}