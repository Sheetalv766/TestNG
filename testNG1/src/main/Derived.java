package testNG_1;

// Derived class
class Derived extends Base {

    @Override
    public void display() {
        // Print statement when this method is called
        System.out.println("Derived display(int)");
    }

    // Invoke the display method
    public static void main(String args[]) {
        // Creating object of this class inside main()
        Derived obj = new Derived();

        // *NOTE* - Will execute base display() method
        obj.display();
    }
}
