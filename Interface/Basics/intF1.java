package OOPs.Interface.Basics;

public class intF1 {
    
}

interface moga {
    void print();
    int number();
}

interface joga extends moga {
    char letter();
}

class poga implements moga {
    public void print() {
        System.out.println("I am moga.");
    }
    public int number() {
        return 10;
    }
}

class koga implements joga {
    public void print()
    {
        System.out.println("You are boga.");
    }
    public int number() {
        return 5;
    }
    public char letter() {
        return 'a';
    }
}