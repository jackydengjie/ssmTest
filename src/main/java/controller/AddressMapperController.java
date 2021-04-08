package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AddressService;
import util.GetMACAddress;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AddressMapperController {

    @Resource
    private AddressService addressService;

    @RequestMapping(path = "/getLocalIp",method = RequestMethod.POST)
    @ResponseBody
    public void getLocalIp(HttpServletRequest request){
        String remoteAddr = request.getRemoteAddr();
        System.out.println("remoteAddr:"+remoteAddr);
        String remotehost = request.getRemoteHost();
        System.out.println("remotehost:"+remotehost);
        GetMACAddress gmac= new GetMACAddress();
        String mac=gmac.getMac(remoteAddr);
        int macadd=addressService.saveMac(mac);
        System.out.println(macadd);



 /*       byte[] bytes = remoteAddr.getBytes();
        String[] split = remoteAddr.split("\\.");
        byte[] aBytes = new byte[4];
        for(int i=0;i<4;i++){
            aBytes[i] =(byte) Integer.parseInt(split[i]);
            System.out.println(aBytes[i]);
        }

        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            System.out.println(address);
            address = InetAddress.getByName(remotehost);
            aBytes=InetAddress.getLocalHost().getAddress();
            System.out.println(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        byte[] byAddress = new byte[0];
        try {
            byAddress = NetworkInterface.getByInetAddress(address)
                        .getHardwareAddress();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println(byAddress.length);
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < byAddress.length; i++) {
            // 单个数组值 就是一个地址位数添加分隔符
            if (i != 0) {
                    stringBuffer.append("-");
            }
            // 字节转换为16进制数
            int number = byAddress[i] & 0xff;
            String strAddr = Integer.toHexString(number);
            if (strAddr.length() == 1) {
                stringBuffer.append("0" + strAddr);
            } else {
                stringBuffer.append(strAddr);
            }
        }
        System.out.println("转换后的MacAddress为:"
                + stringBuffer.toString().toUpperCase());
*/

    }
}
