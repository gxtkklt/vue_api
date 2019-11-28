package cn.ts.controller;


import cn.ts.biz.VueService;
import cn.ts.po.ShopLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vue")
public class VueController {

    @Autowired
    private VueService vueService;


    @GetMapping("/queryList")
    public Map queryList(Integer pageNum ,Integer pageSize){

        //计算出开始下标
        Integer stateIndex = (pageNum-1)*pageSize;
        Map<String,Object> map = new HashMap<>();
        map.put("stateIndex",stateIndex);
        map.put("pageSize",pageSize);
        map.put("pageNum",pageNum);
        Map map2 = vueService.queryList(map);

        return map2;
    }

    @PostMapping("/add")
    public void add(@RequestBody ShopLog shopLog){

        vueService.add(shopLog);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        vueService.delete(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody ShopLog shopLog){
        vueService.update(shopLog);
    }

}
