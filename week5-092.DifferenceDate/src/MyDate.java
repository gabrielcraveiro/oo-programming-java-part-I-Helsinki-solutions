
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int yearsDiff = this.year - comparedDate.year;
        int monthsDiff = this.month - comparedDate.month;
        int dayDiff = this.day - comparedDate.day;

        if (yearsDiff != 0) {
            if (yearsDiff > 0) {
                if ((monthsDiff < 0) || (monthsDiff == 0 && dayDiff < 0)) {
                    yearsDiff -= 1;
                }
            } else {
                if ((monthsDiff > 0) || (monthsDiff == 0 && dayDiff > 0)) {
                    yearsDiff += 1;
                }
            }
        }

        return Math.abs(yearsDiff);
    }
}
