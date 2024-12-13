public class Hand {
    private int value;
    private int upperBound;

    public Hand(int upperBound) {
        this.upperBound = upperBound;
    }

    public void advance() {
        this.value += 1;
        if (this.value >= upperBound) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 0) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}

