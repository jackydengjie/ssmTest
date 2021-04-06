package entity;

public class Toupiao {
    private String uname;
    private Integer piaoshu;
    private String Mac;

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

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }

    public Toupiao(String uname, Integer piaoshu, String mac) {
        this.uname = uname;
        this.piaoshu = piaoshu;
        Mac = mac;
    }

    @Override
    public String toString() {
        return "Toupiao{" +
                "uname='" + uname + '\'' +
                ", piaoshu=" + piaoshu +
                ", Mac='" + Mac + '\'' +
                '}';
    }
}
