package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController("/" )
public class TestController {

    @RequestMapping(value="/data.json",method={RequestMethod.GET})
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","xwh");
        resultMap.put("mynumber","18002090232");
        return resultMap;
    }
}