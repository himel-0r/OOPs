import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

class Attendance_info implements Comparable<Attendance_info> {
    int roll;
    String name;
    int theory;
    int lab;

    public static int choice = 1;

    public Attendance_info(String[] s) {
        // this.roll = s[0];
        this.name = s[1];
        this.theory = Integer.parseInt(s[2]);
        this.lab = Integer.parseInt(s[3]);
    }

    public void show() {
        System.out.print(this.name + " " + this.theory + " " + this.lab + "\n");
    }

    @Override
    public int compareTo(Attendance_info other) {
        if (choice == 1)
            return (Integer.compare(this.theory, other.theory));
        else if (choice == 2)
            return (Integer.compare(this.lab, other.lab));
        else
            return (Integer.compare(other.theory, this.theory));
    }
}

public class problem {
    public static int choice = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("2023_lab7_input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;
        ArrayList<Attendance_info> alai = new ArrayList<Attendance_info>(100);
        int i = 0;

        while ((line = br.readLine()) != null) {
            // System.out.println(line);
            String[] ss = line.split("\\s+");
            Attendance_info ai = new Attendance_info(ss);
            // ai.show();
            alai.add(i, ai);
            i++;
        }

        // show(alai);

        Collections.sort(alai);
        System.out.println("Theory wise sorted...");
        show(alai);

        Attendance_info.choice = 2;

        Collections.sort(alai);
        System.out.println("Lab wise sorted...");
        show(alai);

        Attendance_info.choice = 3;
        Collections.sort(alai);
        System.out.println();
        // show(alai);

        for (Attendance_info aii : alai) {
            bw.write(aii.name + " " + aii.theory + " " + aii.lab + "\n");
        }

        br.close();
        bw.close();
    }

    static void show(ArrayList<Attendance_info> list) {
        System.out.println("Printing the arraylist...");
        for (Attendance_info ai : list) {
            ai.show();
        }
        System.out.println("");
    }
}