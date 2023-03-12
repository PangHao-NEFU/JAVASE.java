package 集合体系结构.成绩排序TreeSet;

public class Student {
    private String name;
    private int Lscore;
    private int Mscore;

    public Student() {
    }

    public Student(String name, int lscore, int mscore) {
        this.name = name;
        this.Lscore = lscore;
        this.Mscore = mscore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLscore() {
        return Lscore;
    }

    public void setLscore(int lscore) {
        Lscore = lscore;
    }

    public int getMscore() {
        return Mscore;
    }

    public void setMscore(int mscore) {
        Mscore = mscore;
    }


}
