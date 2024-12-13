package Interface;

public class Member implements Comparable<Member>{
    private String name;
    private int height;

    public Member(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String toString(){
        return this.getName() + " (" + this.getHeight() + " )";
    }
    @Override
    public int compareTo(Member member) {
        if(this.height == member.getHeight()) {
            return 0;
        } else if(this.height > member.getHeight()){
            return 1;
        } else {
            return -1;
        }
    }
}
