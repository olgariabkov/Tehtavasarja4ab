public enum WorkDay {
    MONDAY("9-17"),
    TUESDAY("9-17"),
    WEDNESDAY("9-17"),
    THURSDAY("9-17"),
    FRIDAY("9-17"),
    SATURDAY("10-13") {
        public String getWorkLocation() {
            return "Home";
        }
    };
    private String hoursOfWork;

    //Konstruktori
    WorkDay(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    //getter
    public String getHoursOfWork() {
        return hoursOfWork;
    }

    public String getWorkLocation() {
        return "Office";
    }
}
