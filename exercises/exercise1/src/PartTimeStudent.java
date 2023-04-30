import java.util.ArrayList;

public class PartTimeStudent extends Student{
    ArrayList<Integer> quizScore1 = new ArrayList<>();
    String name;
    public PartTimeStudent(String name){
        for(int i = 0; i < 15; i++){
            quizScore1.add(i);
        }
        this.name = name;
    }
}
