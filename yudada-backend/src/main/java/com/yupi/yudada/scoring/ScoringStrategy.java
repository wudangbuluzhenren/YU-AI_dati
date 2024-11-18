package com.yupi.yudada.scoring;

import com.yupi.yudada.model.entity.App;
import com.yupi.yudada.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * @author <a href="https://github.com/wudangbuluzhenren">wudangbuluzhenren</a>
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}