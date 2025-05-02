package operator;

class Inheritance1 {  // Fixed spelling mistake
    void draw() {
        System.out.println("Parent Class");
    }
}

class Chill extends Inheritance1 { // Class name should start with uppercase
    @Override
    void draw() {
        System.out.println("Child class");
    }
}

class Show {
    public static void main(String[] args) {
        Chill r = new Chill(); // Object of Child class
        r.draw(); // calls the overridden method
    }
}