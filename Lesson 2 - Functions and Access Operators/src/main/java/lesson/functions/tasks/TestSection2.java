package lesson.functions.tasks;

public class TestSection2 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        
        double result, target;
        
        System.out.println("Testing Task 1...");
        result = tasks.cos(4.6);
        target = Math.cos(4.6);
        System.out.println("Intended output is " + target + ", your output is " + result);
        System.out.println(result == target ? "Test passed" : "Test failed");
        
        System.out.println("Testing Task 2...");
        System.out.print("This number should be 4613: ");
        System.out.println("If there was no output the test failed");
        tasks.task2();
        
        System.out.println("Testing Task 3...");
        result = tasks.task3();
        target = tasks.operateOn2((a, b) -> a % b);
        System.out.println("Intended output is " + target + ", your output is " + result);
        System.out.println(result == target ? "Test passed" : "Test failed");
        
        System.out.println("Testing Task 4...");
        System.out.print("This number should be 46.13: ");
        tasks.task4().accept(46.13);
        System.out.println("If there was no output the test failed");
    }
}