package fun.timu.doj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.timu.doj.model.dto.question.QuestionQueryRequest;
import fun.timu.doj.model.entity.Question;
import fun.timu.doj.model.vo.QuestionAdminVO;
import fun.timu.doj.model.vo.QuestionVO;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author zhengke
 * @description 针对表【question(题目)】的数据库操作Service
 * @createDate 2025-01-06 16:38:09
 */
public interface QuestionService extends IService<Question> {
    /**
     * 校验
     *
     * @param question
     * @param add
     */
    void validQuestion(Question question, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionQueryRequest
     * @return
     */
    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);

    /**
     * 获取题目封装
     *
     * @param question
     * @param request
     * @return
     */
    QuestionVO getQuestionVO(Question question, HttpServletRequest request);

    QuestionVO getQuestionVO(Question question);

    /**
     * 分页获取题目封装
     *
     * @param questionPage
     * @param request
     * @return
     */
    Page<QuestionVO> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);

    /**
     * 获取题目原始信息 未脱敏
     * @param question
     * @param request
     * @return
     */
    QuestionAdminVO getQuestionAdminVo(Question question, HttpServletRequest request);

}
