import java.util.ArrayList;
import java.util.Collections;

public class Session {

    static ArrayList<FullTimeStudent> FullTimeStudentList;
    static ArrayList<PartTimeStudent> PartTimeStudentList;

    public Session(){
        FullTimeStudentList = new ArrayList<>();
        PartTimeStudentList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            FullTimeStudentList.add(new FullTimeStudent());
            PartTimeStudentList.add(new PartTimeStudent("id" + i));
        }
    }

    public int averageScore(){
        int avg = 0;
        int all = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                all += FullTimeStudentList.get(i).quizScore1.get(j);
                all += PartTimeStudentList.get(i).quizScore1.get(j);
            }
            avg = all/15/20;
        }
        return avg;
    }

    public  void quizScoresAscend(ArrayList<Integer> scoresList){
        Collections.sort(scoresList, Collections.reverseOrder());
        for (int i = 0; i < scoresList.size(); i++){
            System.out.println(scoresList);
        }
    }

    public void partTimeStudentName(){
        for (int i = 0; i < 10; i++){
            System.out.println(PartTimeStudentList.get(i).name);
        }
    }

    public void fullTimeStudentScores(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                System.out.println("quizScore1"+FullTimeStudentList.get(i).quizScore1);
                System.out.println("quizScore2"+FullTimeStudentList.get(i).quizScore2);
            }
        }
    }
}
