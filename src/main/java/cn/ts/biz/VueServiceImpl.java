package cn.ts.biz;


import cn.ts.mapper.VueMapper;
import cn.ts.po.ShopLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VueServiceImpl implements VueService {

    @Autowired
    private VueMapper vueMapper;


    @Override
    public void add(ShopLog shopLog) {
        vueMapper.add(shopLog);
    }

    @Override
    public void delete(Integer id) {
        vueMapper.delete(id);
    }

    @Override
    public Map queryList(Map<String, Object> map) {

        int count = vueMapper.queryCount(map);

        List<Map<String,Object>> list = vueMapper.queryList(map);
        map.put("totalCount",count);
        map.put("data",list);

        return map;
    }

    @Override
    public void update(ShopLog shopLog) {
        vueMapper.update(shopLog);
    }
}
