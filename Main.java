public class Main {
    public static void main(String[] args){
        QuizService question = new QuizService();
        question.setQuestions();
        question.getQuestions();
        question.getScore();
    }
}