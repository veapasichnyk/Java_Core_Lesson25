import java.util.Scanner;

public class Application {

    void  menu(Cinema cinema){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput 1 to add new seance: \n" +
                           ("Input 2 to remove some seance: \n") +
                           ("Input 3 to getting schedule for day you need \n") +
                           ("Input 4 to getting movies library \n") +
                           ("Input 5 to remove some movie \n")
                          );

        int choose = scanner.nextInt();
        switch (choose){
            case 1 ->{cinema.addSeance(); break;}
            case 2 ->{ System.out.print("Input day of week: ");
                String day = ChooseWhichMovieYouWantsToSee.getDay();
                cinema.removeSeance(day); break;}
            case 3 ->{cinema.getScheduleForDay(); break;}
            case 4 ->{cinema.getAllMovies(); break;}
            case 5 ->{cinema.removeMovie(); break;}

            default -> System.out.println("Please, choose from list!");

        }

    }

    public static void main(String[] args) {

        Application application = new Application();
        Cinema cinema = new Cinema();

        while (true)
            application.menu(cinema);

    }

}
