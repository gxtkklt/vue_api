package cn.ts.mapper;

import cn.ts.po.ShopLog;

import java.util.List;
import java.util.Map;

public interface VueMapper {
    void add(ShopLog shopLog);

    void delete(Integer id);

    int queryCount(Map<String,Object> map);

    List<Map<String,Object>> queryList(Map<String,Object> map);

    void update(ShopLog shopLog);
}
