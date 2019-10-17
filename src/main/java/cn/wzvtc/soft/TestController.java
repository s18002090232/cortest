package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController("/" )
public class TestController {

    @RequestMapping(value="data.json",method={RequestMethod.GET})
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","田所浩二");
        resultMap.put("mynumber","114514");
        return resultMap;
    }
}