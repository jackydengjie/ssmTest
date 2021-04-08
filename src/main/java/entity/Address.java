package entity;

public class Address {
    private String MacAddress;
    private String IpAddress;

    public Address(String macAddress,String ipAddress) {
        MacAddress = macAddress;
        IpAddress = ipAddress;
    }

    public Address() {
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

    @Override
    public String toString() {
        return "Address{" +
                "MacAddress='" + MacAddress + '\'' +
                ", IpAddress='" + IpAddress + '\'' +
                '}';
    }
}
