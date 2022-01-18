import java.util.*;

public class Cinema {

    TreeMap<Days, Schedule> schedules = new TreeMap<>();


    static Time open;
    static Time close;


   Cinema() {
        Arrays.stream(Days.values()).forEach(d->schedules.put(d,new Schedule()));
        System.out.println("Open time ");
        open = ChooseWhichMovieYouWantsToSee.getTime();
        System.out.println("Close time: ");
        close = ChooseWhichMovieYouWantsToSee.getTime();
    }

    void getAllMovies(){
        //Movie library is  formed on the basis of all films which has been going during the week
        HashSet<String> movieLibrary = new HashSet<>();
        Arrays.stream(Days.values()).forEach(day->{
            Schedule schedule = schedules.get(day);
            schedule.scheduleSeances.forEach(seance->{
                movieLibrary.add(seance.movie.getTitle());
            });
        });
        movieLibrary.forEach(System.out::println);
    }

    void getScheduleForDay(){
        try{
            String day = ChooseWhichMovieYouWantsToSee.getDay();
            Schedule schedule = schedules.get(Days.valueOf(day.toUpperCase()));
            schedule.scheduleSeances.forEach(System.out::println);}
        catch (IllegalArgumentException exception){
            System.out.println("You entered the day wrong. Try again, please");
        }
    }

    void addSeance ( ) {
        String day = ChooseWhichMovieYouWantsToSee.getDay();
        try {
            Schedule schedule = schedules.get(Days.valueOf(day.toUpperCase()));
            schedule.addSeance();
        }
        catch (IllegalArgumentException exception){
            System.out.println("You entered the day wrong. Try again, please");
        }

    }


    void removeMovie() {
        System.out.println("You are going to delete all seances with some movie.\nYou also " +
                           "will delete this film from library");
        Movie movie = ChooseWhichMovieYouWantsToSee.getMovie();
        schedules.values().forEach((schedule) ->
                                           schedule.scheduleSeances.removeIf(seance -> seance.movie.getTitle().equalsIgnoreCase(movie.getTitle())));
    }


    void removeSeance ( String day) {
        try {
            schedules.get(Days.valueOf(day.toUpperCase())).removeSeance();
        }
        catch (IllegalArgumentException exception){
            System.out.println("You entered the day wrong. Try again please");
        }
    }

}