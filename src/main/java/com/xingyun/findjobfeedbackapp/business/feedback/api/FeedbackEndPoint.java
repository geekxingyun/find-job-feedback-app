package com.xingyun.findjobfeedbackapp.business.feedback.api;

import com.xingyun.findjobfeedbackapp.business.feedback.dao.jpa.FeedbackJpaRepository;
import com.xingyun.findjobfeedbackapp.business.feedback.model.FeedbackDO;
import com.xingyun.findjobfeedbackapp.model.vo.AppResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 */
@RestController
public class FeedbackEndPoint {

    private final AppResponseVO appResponseVO;

    private final FeedbackJpaRepository feedbackJpaRepository;


    public FeedbackEndPoint(AppResponseVO appResponseVO,FeedbackJpaRepository feedbackJpaRepository) {
        this.appResponseVO = appResponseVO;
        this.feedbackJpaRepository = feedbackJpaRepository;
    }

    @GetMapping(value = "/feedback/list")
    public AppResponseVO showFeedBackList(){
        appResponseVO.setResponseCode(200);
        appResponseVO.setResponseMessage("获取所有的反馈信息成功");
        appResponseVO.setResponseBusinessData(null);
        return appResponseVO;
    }

    @GetMapping(value = "/feedback/add")
    public AppResponseVO addFeedBack(){

        FeedbackDO feedbackDO=new FeedbackDO();
        feedbackDO.setCompanyName("卫宁健康");
        feedbackDO.setInterviewFeedbackRemark("合同和薪酬工作时间问题,主动离职");
        feedbackDO.setInterviewFeedbackResult(false);
        this.feedbackJpaRepository.save(feedbackDO);
        appResponseVO.setResponseCode(200);
        appResponseVO.setResponseMessage("获取所有的反馈信息成功");
        appResponseVO.setResponseBusinessData(null);
        return appResponseVO;
    }
}
