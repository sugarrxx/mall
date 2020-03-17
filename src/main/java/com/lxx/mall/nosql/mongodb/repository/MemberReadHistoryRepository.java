package com.lxx.mall.nosql.mongodb.repository;


import com.lxx.mall.nosql.mongodb.document.MemberReadHistory;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员商品浏览历史Repository
 *
 * @author lixiaoxiang
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {

    /**
     * 根据会员id按时间倒序获取浏览记录
     *
     * @param memberId 会员id
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
