public class Seance implements Comparable<Seance> {
    Movie movie;
    Time  startTime;
    Time  endTime;

    public Seance(Movie movie, Time startTime){
        this.movie     = movie;
        this.startTime = startTime;
        int min  = startTime.getMin() + movie.duration.getMin();
        int hour = startTime.getHour() + movie.duration.getHour();
        if ( min >= 60 ) {
            hour += 1;
            min = Math.abs(60 - min);
            if ( hour > 24 )
                hour = Math.abs(24 - hour);
        }
        Time tempTime = new Time(min, hour);
        this.endTime = tempTime;

    }

    public Time getStartTime( ){
        return startTime;
    }

    public void setStartTime(Time startTime){
        this.startTime = startTime;
    }

    public Time getEndTime( ){
        return endTime;
    }

    public void setEndTime(Time endTime){
        this.endTime = endTime;
    }

    public Movie getMovie( ){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    @Override
    public String toString( ){
        return "Film " + movie +
               "  Seance start time:  " + startTime +
               "  Ending: " + endTime +
               ' ';
    }

    @Override
    public int compareTo(Seance o){
        return Integer.compare(( movie.duration.getMin() + movie.duration.getHour() * 60 ), ( o.movie.duration.getMin() + o.movie.duration.getHour() * 60 ));
    }

}
