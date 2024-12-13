public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance() {
        //Increasing day by 1
        // If days exceeds 30 then month is increased by 1 and day is reset to 1.
        // If months exceeds 12 then month is reset to 1 and year is increased by 1
        day++;
        if (day > 30) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void advance(int howManyDays) {
        //Iterating each day one by one with the given input and calling advance method each time
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        for (int i = 0; i < days; i++) {
            newDate.advance();
        }
        return newDate;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }

        return false;

    }
}
