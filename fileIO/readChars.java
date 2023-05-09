/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs.fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class readChars {
       void characters () throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       int i;
       do{
         i = in.read();
         System.out.println((char)i);
       }while (i != 'q');
   }
   public static void main(String args[]) throws IOException{
       readChars ob = new readChars();
       ob.characters();
   }


}
