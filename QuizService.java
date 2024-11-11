import java.util.Scanner;

public class QuizService {
    Question questions[] = new Question[3];
    String selection[] = new String[3];

    public void getQuestions(){
        int i=0;
        for(Question q : questions){
            System.out.print("Question No : " + q.getId());
            System.out.println(q.getQuestion());
            for(String question : q.getOptions()){
                System.out.println(question);
            }
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
    }

    public void setQuestions(){
            questions[0] = new Question(1, "what", new String[]{"1992", "1995", "1998"}, "1995");
            questions[1] = new Question(2, "why", new String[]{"1992", "1995", "1998"}, "1992");
            questions[2] = new Question(3, "how", new String[]{"1992", "1995", "1998"}, "1998");
    }

    public void getScore(){
        int score = 0;
        for(int j=0;j<questions.length;j++){
            if(questions[j].getAnswer().equals(selection[j])){
                score = score+1;
            }
        }
        System.out.println("Your score is " + score);
    }
}
