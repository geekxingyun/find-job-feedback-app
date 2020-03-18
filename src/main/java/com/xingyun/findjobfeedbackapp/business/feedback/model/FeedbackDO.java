package com.xingyun.findjobfeedbackapp.business.feedback.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 此对象与数据库表一一对应,通过DAO层向上输出对象
 * 反馈表
 * @author qing-feng.zhao
 */
@Data
@Table(name = "t_feed_back")
@Entity
public class FeedbackDO {

    @Id
    @GeneratedValue(generator = "SnowFlakeId")
    @GenericGenerator(name = "SnowFlakeId", strategy = "com.xingyun.findjobfeedbackapp.customize.SnowFlakeIdGenerator")
    @Column(name = "pk_uuid")
    private Long uuid;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "interview_feedback_remark")
    private String interviewFeedbackRemark;

    @Column(name = "interview_feedback_result")
    private Boolean interviewFeedbackResult;
}
