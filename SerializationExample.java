package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Rashni", 19);
        //serialization
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            out.writeObject(person);
        }catch(IOException e){
        System.out.println(e.getMessage());
    }

    // Deserialization
    try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))){
        Person deserializedPerson = (Person) in.readObject();
        System.out.println("Name: " + deserializedPerson.name + " , Age: " + deserializedPerson.age);
    }catch(IOException | ClassNotFoundException e){
        System.out.println(e.getMessage());
    }
}
}
