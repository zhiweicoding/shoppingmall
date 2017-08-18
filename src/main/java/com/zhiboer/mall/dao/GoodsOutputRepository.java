package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.GoodsOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface GoodsOutputRepository {

    void insertOne(GoodsOutput goodsOutput);

    List<GoodsOutput> selectAll();

    List<GoodsOutput> selectByLike(GoodsOutput goodsOutput);

    void deleteById(String id);

    void updateById(GoodsOutput goodsOutput);
}
