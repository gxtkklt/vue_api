package cn.ts.biz;

import cn.ts.po.ShopLog;

import java.util.List;
import java.util.Map;

public interface VueService {
    void add(ShopLog shopLog);

    void delete(Integer id);

    Map queryList(Map<String,Object> map);

    void update(ShopLog shopLog);
}
