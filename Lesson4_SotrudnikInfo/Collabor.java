class Collabor {
  String name;
  String position;
  String email;
  String phoneNum;
  int salary;
  int age;

   Collabor(String colName, String colPos, String colEmail, String colPhone, int colSal, int colAge) {
    name = colName;
    position = colPos;
    email = colEmail;
    phoneNum = colPhone;
    salary = colSal;
    age = colAge;
  }

  void colPrint() {
    //метод выводит на экран информацию о сотруднике
    System.out.println("\nФИО: " + name);
    System.out.println("ДОЛЖНОСТЬ: " + position);
    System.out.println("E-mail:" + email);
    System.out.println("Телефон: " + phoneNum);
    System.out.println("Зарплата: " + salary + " руб.");
    System.out.println("Возраст: " + age + " лет");
    System.out.println("\n");

  } 
}

