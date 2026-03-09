import java.util.Scanner;
class java_week1_taask{
    String name;
    int id;
    double percentage;
    java_week1_taask(String name, int id, double percentage){
        this.name = name;
        this.id = id;
        this.percentage = percentage;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Percentage: " + percentage);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();
        java_week1_taask student = new java_week1_taask(name, id, percentage);
        student.display();
    }
}