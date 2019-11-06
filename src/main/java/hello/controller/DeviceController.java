package hello.controller;

import hello.model.Device;
import hello.model.Type;
import hello.model.TypeFormObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeviceController {

    @GetMapping("/index")
    public String showDevices(Model model) {
        List<Device> devices = new ArrayList<>();
        Device d1 = new Device(1, "HP Pavilio 15", Type.LAPTOP.toString(), 2599, "https://www.emag.ro/laptop-hp-pavilion-15-cs0027nq-cu-procesor-intelr-coretm-i5-8250u-pana-la-3-40-ghz-kaby-lake-r-15-6-full-hd-8gb-256gb-ssd-intelr-uhd-graphics-620-free-dos-silver-4mr32ea/pd/DXRXVSBBM/?cmpid=86846&gclid=Cj0KCQiA-4nuBRCnARIsAHwyuPoFCCurXJwHeapRay33HrOQlveZRPG45ytgzde1DbFOVe_zpscN21IaAnsTEALw_wcB");
        Device d2 = new Device(2, "Lenovo V130", Type.LAPTOP.toString(), 1699, "https://www.emag.ro/laptop-lenovo-v130-15ikb-cu-procesor-intelr-coretm-i5-7200u-pana-la-3-10-ghz-kaby-lake-15-6-full-hd-4gb-500gb-intelr-hd-graphics-620-free-dos-iron-grey-81hn00ejri/pd/DYXX8LBBM/?cmpid=86846&gclid=Cj0KCQiA-4nuBRCnARIsAHwyuPrPU8gONAKyc1kPSJFpP8CGaykAHS7OOk80BY3V0SRcYOdfCVPJSesaAuasEALw_wcB");
        Device d3 = new Device(3, "iPhone 8", Type.MOBILE_PHONE.toString(), 2599, "https://www.emag.ro/telefon-mobil-apple-iphone-8-64gb-4g-space-grey-mq6g2rm-a/pd/D4094NBBM/?cmpid=87053&gclid=Cj0KCQiA-4nuBRCnARIsAHwyuPpmzg5w4b-ehmzcCuCrPiHsEs_iynbHLWVyQASsSgOWRA2wz6w8nwYaAti3EALw_wcB");
        Device d4 = new Device(4, "Samsung Smart LED", Type.TELEVISION.toString(), 1499, "https://www.emag.ro/televizor-led-smart-samsung-108-cm-43nu7022-4k-ultra-hd-ue43nu7022kxxh/pd/DKD0HSBBM/?cmpid=87063&gclid=Cj0KCQiA-4nuBRCnARIsAHwyuPqUmweVS3DavSzBC2_pwTo0vHKgkO9RZ8IyyRlqPw0Co2VCGANolH8aAuhBEALw_wcB");

        devices.add(d1);
        devices.add(d2);
        devices.add(d3);
        devices.add(d4);

        model.addAttribute("devices", devices);

        // add attribute for filter
        model.addAttribute("typeFormObject", new TypeFormObject());
        return "myPage";
    }

    @RequestMapping(value = "/processTable", params = "filter", method = RequestMethod.POST)
    public String filterTable(@ModelAttribute(name = "typeFormObject") TypeFormObject typeFormObject) {
        System.out.println("Filtering should be done...");
        return "myPage";
    }

    @RequestMapping(value = "/processTable", params = "clear", method = RequestMethod.POST)
    public String clear() {
        System.out.println("Clear filter");
        return "redirect:index";
    }

}
