//Create a program where child class will be inheriting the properties of parent class.
class parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class child extends parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.show();
    }
}
