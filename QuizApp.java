import java.util.*;

class Question {
    String question;
    String[] options;
    int correctOption;

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of quiz questions
        List<Question> quiz = new ArrayList<>();
        quiz.add(new Question(
                "1. Which language is used for Android development?",
                new String[]{"1. Python", "2. Java", "3. HTML", "4. CSS"},
                2
        ));
        quiz.add(new Question(
                "2. Which keyword is used to create a class in Java?",
                new String[]{"1. new", "2. make", "3. class", "4. object"},
                3
        ));
        quiz.add(new Question(
                "3. Which of the following is not a programming language?",
                new String[]{"1. Java", "2. Python", "3. C++", "4. Google"},
                4
        ));

        int score = 0;

        System.out.println("===== ONLINE QUIZ APP =====\n");

        // Loop through each question
        for (Question q : quiz) {
            System.out.println(q.question);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();

            if (userAnswer == q.correctOption) {
                score++;
            }
            System.out.println();
        }

        System.out.println("===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + "/" + quiz.size());

        if (score == quiz.size()) {
            System.out.println("Excellent! Perfect score!");
        } else if (score >= quiz.size() / 2) {
            System.out.println("Good job! You passed.");
        } else {
            System.out.println("Keep practicing. You can improve!");
        }

        sc.close();
    }
}
