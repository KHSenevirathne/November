
// How to Create JAVA Classes

class Demo{ // Class Name
    
    public static void main(String [] args){ // Main Method

        System.out.println("Hello World !!"); // Print Console Function

    }
}

class Dog{
    // Class Propertise (Attributes)
    String breed;
    int age;
    
    public Dog(String breed, int age){ // Constructor
        this.breed = breed;
        this.age = age;
    }

    String getDog(){ // Class Behaviors (Methods)
        return "Breed: " + breed + ", Age: " + age;
    }
}
