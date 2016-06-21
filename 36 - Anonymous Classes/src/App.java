class Machine {
    public void start() {
        System.out.println("Starting machine ...");
    }
}
 
interface Plant {
    public void grow();
}
 
public class App {
 
    public static void main(String[] args) {
         
        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        Machine machine1 = new Machine() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        };
         
        machine1.start();
         
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
                 
            }
        };
         
        plant1.grow();
    }
}