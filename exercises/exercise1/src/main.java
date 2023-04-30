public class main {

    public static void main(String[] args) {
        Session session = new Session();
        session.quizScoresAscend(Session.FullTimeStudentList.get(0).quizScore1);
        session.partTimeStudentName();
        session.fullTimeStudentScores();
    }
}
