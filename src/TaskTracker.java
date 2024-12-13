import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String , ArrayList<Integer>> completedExercises;

    public  TaskTracker(){
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise){
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        this.completedExercises.get(user).add(exercise);
    }

    public void print(){
        for(String name : completedExercises.keySet()){
            System.out.println(name + ":" + completedExercises.get(name));
        }
    }

    public static void main(String[] args) {
        TaskTracker test = new TaskTracker();
        test.add("Ada",3);
        test.add("Ada",9);

        test.add("Milan",7);
        test.add("Milan",77);


        test.print();
    }
}
