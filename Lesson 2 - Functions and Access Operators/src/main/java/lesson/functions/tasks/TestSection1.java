package lesson.functions.tasks;

public class TestSection1 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        
        double result, target;
        
        System.out.println("Testing Task 1...");
        result = tasks.add(4.6, 1.3);
        target = 4.6 + 1.3;
        System.out.println("Intended output is " + target + ", your output is " + result);
        System.out.println(result == target ? "Test passed" : "Test failed");
        
        System.out.println("Testing Task 2...");
        result = tasks.cube(7.5);
        target = Math.pow(7.5, 3);
        System.out.println("Intended output is " + target + ", your output is " + result);
        System.out.println(result == target ? "Test passed" : "Test failed");
        
        System.out.println("Testing Task 3...");
        result = tasks.myFunction();
        target = tasks.operateOn(4) * tasks.operateOn(6) * tasks.operateOn(1) * tasks.operateOn(3);
        System.out.println("Intended output is " + target + ", your output is " + result);
        System.out.println(result == target ? "Test passed" : "Test failed");
    }
}