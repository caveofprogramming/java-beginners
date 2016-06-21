public class App {
 
    public static void main(String[] args) {
         
         
        Plant plant1 = new Plant();
         
        // Tree is a kind of Plant (it extends Plant)
        Tree tree = new Tree();
         
        // Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
        Plant plant2 = tree;
         
        // plant2 references a Tree, so the Tree grow() method is called.
        plant2.grow();
         
        // The type of the reference decided what methods you can actually call;
        // we need a Tree-type reference to call tree-specific methods.
        tree.shedLeaves();
         
        // ... so this won't work.
        //plant2.shedLeaves();
         
        // Another example of polymorphism.
        doGrow(tree);
    }
     
    public static void doGrow(Plant plant) {
        plant.grow();
    }
 
}