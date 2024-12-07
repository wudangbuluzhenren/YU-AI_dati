# YU-AI答题平台
YU-AI答题平台是一款基于 Vue 3 + Spring Boot + Redis + ChatGLM + RxJava + SSE 的 AI 答题应用平台。
用户可以基于 A| 快速制作并发布答题应用，支持检索、分享、在线答题并基于 AI得到回答总结;管理员可以集中管理和审核应用。

## 技术选型
- Java Spring Boot 开发框架（万用后端模板）
- 存储层：MySQL 数据库 + Redis 缓存 + 腾讯云 COS 对象存储
- MyBatis-Plus 及 MyBatis X 自动生成
- Redisson 分布式锁
- Caffeine 本地缓存
- 基于 ChatGLM 大模型的通用 AI 能力
- RxJava 响应式框架 + 线程池隔离实战 
- SSE 服务端推送
- Shardingsphere 分库分表
- 幂等设计 + 分布式 ID 雪花算法
- 多种设计模式
- 多角度项目优化：性能、稳定性、成本优化、产品优化等

### 项目展示

用户答题页面：

![](https://pic.yupi.icu/1/20240604145230156.png)

创建应用页：

![](https://pic.yupi.icu/1/20240604145230361.png)

创建题目页，涉及复杂动态嵌套表单的开发：

![](https://pic.yupi.icu/1/20240604145230557.png)

应用管理页面：

![](https://pic.yupi.icu/1/20240604145230731.png)

统计分析页面：

![](https://pic.yupi.icu/1/20240604145230905.png)

应用分享功能：

![](https://pic.yupi.icu/1/20240604145231269.png)

## 架构设计

总体业务流程：
![image](https://github.com/user-attachments/assets/6bdf1ed6-e439-4d7f-83ad-7ef7a39a42e3)
上传题目流程：
![image](https://github.com/user-attachments/assets/98073947-3a19-4f10-b570-2ccbd757b9b2)
用户答题流程：
![image](https://github.com/user-attachments/assets/70546842-7e52-4e69-b03c-6cb0602e41fb)
AI创建题目流程：
![image](https://github.com/user-attachments/assets/b1e79a7f-88e1-469d-a74d-d254cf044940)
AI总结流程：
![image](https://github.com/user-attachments/assets/3b46d27a-9f71-4344-87e8-193a9a126350)
总体时序图：
![image](https://github.com/user-attachments/assets/f9c24c92-348b-4e69-a694-ef7cb81b917e)
