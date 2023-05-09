/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs.fileIO;

import java.io.File;

/**
 *
 * @author DELL
 */
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        File f = new File("D:\\input.txt");
        p(f.getName());
        p(f.getPath());
    }
}
