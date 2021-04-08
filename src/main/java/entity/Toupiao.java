package entity;

public class Toupiao {
    private String uname;
    private Integer piaoshu;


    public Toupiao() {
    }

    public String getUanme() {
        return uname;
    }

    public void setUanme(String uname) {
        this.uname = uname;
    }

    public Integer getPiaoshu() {
        return piaoshu;
    }

    public void setPiaoshu(Integer piaoshu) {
        this.piaoshu = piaoshu;
    }


    public Toupiao(String uname, Integer piaoshu) {
        this.uname = uname;
        this.piaoshu = piaoshu;

    }

    @Override
    public String toString() {
        return "Toupiao{" +
                "uname='" + uname + '\'' +
                ", piaoshu=" + piaoshu +
                '}';
    }
}
