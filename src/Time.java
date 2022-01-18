import java.util.Objects;

public class Time implements Comparable<Time> {
    private int min;
    private int hour;

    public Time(int min, int hour) {
        if (min >= 0 & min <= 60)
            this.min = min;
        if (hour <= 24 & hour >= 0)
            this.hour = hour;
        else{
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException exception){
                System.out.println("Hour in diapason 0-24! Min in diapason 0-60 only! ");
            }
        }
    }

    public int getHour( ){
        return hour;
    }

    public int getMin( ){
        return min;
    }

    @Override
    public int compareTo(Time o){
        if (o.getHour()>getHour()) return 1;
        else if(o.getHour()==getHour()){
            if (o.getMin()>getMin())return 1;
            else return 0;
        }
        else return 0;
    }

    @Override
    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Time time = (Time) o;
        return min == time.min && hour == time.hour;
    }

    @Override
    public int hashCode( ){
        return Objects.hash(min, hour);
    }

    @Override
    public String toString( ){
        return "Time{" +
               "min=" + min +
               ", hour=" + hour +
               '}';
    }
}
