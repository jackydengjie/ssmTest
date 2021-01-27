package entity;

public class Toupiao {
    private String uanme;
    private Integer piaoshu;

    public Toupiao() {
    }

    public Toupiao(String uanme,Integer piaoshu) {
        this.uanme = uanme;
        this.piaoshu = piaoshu;
    }

    public String getUanme() {
        return uanme;
    }

    public void setUanme(String uanme) {
        this.uanme = uanme;
    }

    public Integer getPiaoshu() {
        return piaoshu;
    }

    public void setPiaoshu(Integer piaoshu) {
        this.piaoshu = piaoshu;
    }

    @Override
    public String toString() {
        return "Toupiao{" +
                "uanme='" + uanme + '\'' +
                ", piaoshu=" + piaoshu +
                '}';
    }
}
