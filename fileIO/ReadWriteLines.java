/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ReadWriteLines {
   public static void main(String args[]){
       BufferedReader br = null;
       BufferedWriter bw = null;
       try {
           bw = new BufferedWriter(new FileWriter(
                   new File("D:\\output.txt")));
       } catch (IOException ex) {
           Logger.getLogger(ReadWriteLines.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           br = new BufferedReader(new FileReader(new File(
                   "D:\\input.txt"
                   //"C:\\Users\\DELL\\Downloads\\Qualification_for_Regular_AssocProf.pdf"
           )));           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(ReadWriteLines.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       String line = null;
       try {
           while ((line = br.readLine())!= null){
               System.out.println("Line: " + line);
               bw.write(line);
               bw.newLine();
               //throw new ArithmeticException();
           }
       } catch (IOException ex) {
           Logger.getLogger(ReadWriteLines.class.getName()).log(Level.SEVERE, null, ex);
       }
       finally{
            try {
                br.close();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadWriteLines.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       System.out.println("Something.");
       
   } 
}
