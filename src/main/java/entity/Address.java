package entity;

public class Address {
    private String MacAddress;
    private String IpAddress;
    private String Canme;

    public Address() {
    }

    public Address(String macAddress, String ipAddress, String canme) {
        MacAddress = macAddress;
        IpAddress = ipAddress;
        Canme = canme;
    }

    public String getMacAddress() {
        return MacAddress;
    }

    public void setMacAddress(String macAddress) {
        MacAddress = macAddress;
    }

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public String getCanme() {
        return Canme;
    }

    public void setCanme(String canme) {
        Canme = canme;
    }

    @Override
    public String toString() {
        return "Address{" +
                "MacAddress='" + MacAddress + '\'' +
                ", IpAddress='" + IpAddress + '\'' +
                ", Canme='" + Canme + '\'' +
                '}';
    }
}
