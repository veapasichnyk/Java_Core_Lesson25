public enum Days {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private final String title;

    Days(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
