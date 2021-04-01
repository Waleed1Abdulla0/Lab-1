package Lab2;

public class Q1 {
    static int[]ar1={10, 20, 30, 40, 50, 60, 70, 80, 90};
    static int[]ar2=new int[9] ;
    static public void print(){
        for (int i = 0; i <ar1.length ; i++) {
            System.out.print(ar1[i] + "  ");
        }
    }
    static public void print1(){
        for (int i = 0; i <ar2.length ; i++) {
            System.out.print(ar2[i] + "  ");
        }
        System.out.println("  ");
    }
    static public void revers(){
        for(int i=0;i<ar1.length;i++)
            ar2[i]=ar1[ar1.length-(i+1)];
        for(int i=0;i<ar1.length;i++)
            ar1[i]=ar2[i];
    }
    public static void main(String[] args) {
        System.out.print(" The First Array: ");
        print1();
        revers();
        System.out.print(" The Last Array: ");
        print();
        System.out.print(" The Revers Array: ");
        print1();
    }
}