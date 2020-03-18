package com.xingyun.findjobfeedbackapp.business.feedback.dao.jpa;

import com.xingyun.findjobfeedbackapp.business.feedback.model.FeedbackDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackJpaRepository extends JpaRepository<FeedbackDO,Long> {
}
