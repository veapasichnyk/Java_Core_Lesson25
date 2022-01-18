import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    Set<Seance> scheduleSeances = new TreeSet<>();
    public void  addSeance(){
        Seance seance = ChooseWhichMovieYouWantsToSee.getSeance();
        if (seance.startTime.compareTo(Cinema.open)==0 & seance.startTime.compareTo(Cinema.close)==1)
        {scheduleSeances.add(seance);}
        else System.out.println("The seance can`t start before the cinema opens or the last seance must start before the cinema closes. Sorry, chose another time ");
    }
    public void  removeSeance(){
        Seance seance = ChooseWhichMovieYouWantsToSee.getSeance();
        if (scheduleSeances.contains(seance)){
            scheduleSeances.remove(seance);
            System.out.println("Seance has just successfully  deleted");
        }
        else System.out.println("Can`t find this seance. Sorry");

    }
}
