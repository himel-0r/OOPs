/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myCollections;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Muhammad Ibrahim
 */
class tree {
    private String name;
    private double age;
    
    public tree(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }
    
}
public class FOUR_myhashmap_with_myclass {
    public static void main(String args[]){
        System.out.println("A person owns a single tree ...");
        HashMap<String, tree> person_owns_tree = new HashMap<>();
        person_owns_tree.put("Abdullah", new tree("Mango", 3.8));
        person_owns_tree.put("Tamanna", new tree("Jackfruit", 3.2));
        person_owns_tree.put("Bashir", new tree("Mango", 1.2));

        System.out.println(person_owns_tree);
///////////////////////////////////////////////////////////////////////////////

        System.out.println("Now a person may own multiple trees ... ");
        HashMap<String, ArrayList<tree>> person_owns_multipleTrees = new HashMap<>();
        
        ArrayList<tree> trees = new ArrayList<tree>();
        trees.add(new tree("Mango", 3.4));
        trees.add(new tree("Jackfruit", 1.4));
        person_owns_multipleTrees.put("Abdullah", trees);

        trees.clear();
        trees.add(new tree("Banana", 1.4));
        trees.add(new tree("Apple", 1.1));
        trees.add(new tree("Grape", 0.1));
        person_owns_multipleTrees.put("Tamanna", trees);
        
        System.out.println(person_owns_multipleTrees);
    }
}
