import java.util.ArrayList;

public class FullTimeStudent extends Student{
    ArrayList<Integer> quizScore1 = new ArrayList<>();
    ArrayList<Integer> quizScore2 = new ArrayList<>();

    public FullTimeStudent(){
        for(int i = 0; i < 15; i++){
            quizScore1.add(i);
            quizScore2.add(i*2);
        }
    }

}
