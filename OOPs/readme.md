# Why we need OOPs?
- OOPs stands for Object Oriented Programming System.
- It is a programming paradigm that uses objects and classes to design and structure software.
- OOPs allows for better organization of code, making it easier to manage and maintain.
- It promotes code reusability through inheritance, allowing developers to create new classes based on existing ones.
- OOPs also supports encapsulation, which helps to hide the internal details of an object and only expose necessary information, improving security and reducing complexity.
- Polymorphism is another key feature of OOPs, allowing objects to be treated as instances of their parent class, enabling flexibility and extensibility in code design.
- Overall, OOPs helps in creating modular, scalable, and maintainable software applications.

## Let us understand the concept of OOPs with an example problem statement.:
  - we want to create students data like name, age, roll number, etc. and we want to perform some operations on it like display the data, update the data, etc.and then we have to write functions to perform the operations.And we have to pass multiplr argument and parameter to the function and every argument i.e variable are independent to each other, here we can make mistake to mamage too much var.
##
    string name;
    int age;
    int id;
    string course;
    void displayData(string name, int age, int id, string course){}
- In the above example, we have to manage multiple variables and functions to perform operations on the student data. This can lead to confusion and errors, especially as the number of students increases.
- However, by using OOPs, we can create a class called "Student" that encapsulates all the relevant data and functions related to a student. This way, we can create multiple instances of the Student class, each representing a different student, and easily manage their data and operations without worrying about variable conflicts or errors.
