package topic01_variables;

public class VariableDemo {
    // Static Variable (Its value is shared among all instances of this class)
    static float staticvar = 3.14f;

    // Instance Variable (Its value is unique to all instances of this class)
    String instanceVar = "Instance";

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        System.out.println("Static Value - " + VariableDemo.staticvar);
        System.out.println("Instance Value - " + obj.instanceVar);

        int localVar = 10;
        System.out.println("Local value - " + localVar);
    }
}
