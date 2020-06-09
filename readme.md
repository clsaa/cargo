## Cargo

### 需求

本文选择领域驱动设计的经典项目——货物追踪系统 (cargo tracking system ， 简称 CTS) 作为研究案例， 原因在于 CTS:1)面向物流领域， 具有合适的领域复杂度； 2)具有合适的问题规模 ， 便于阐述； 3)领域驱动设 计领域的多个研究选择 CTS 作为问题分析场景，提供了丰富的文档资料。

作为一个货物追踪系统，CTS 最核心的业务过程在于追踪货物 (Cargo) 从位置(Location) A 运送到 Location B 的各个状态。每件 Cargo 在创建时，都被赋予一个追踪号 (TrackingId) 以跟踪该 Cargo 状态。同时，每件 Cargo 都对应着一个 航线说明(DeliverySpecification)，确定了该 Cargo 的出发 Location 和 目的 Location 。每件 Cargo 还对应着 一个 包含 多个 航段(Leg)的航线 (Itinerary) ，根据现有航程(Voyage) 为其分配 。其中，Voyage 是指货轮 等运输工具调度好的航行路线 ， 包含一系列运输动作(CarrierMovement) ，Cargo 正是通过这一系列运输动作 在不同地点之间转移 。 在 Cargo 的航线确定之后，处理事件 (HandlingEvent) 负责对 Cargo 采取不同动作， 比 如装货、卸货等 。 Cargo 执行的所有 HandlingEvent 都将存入该 Cargo 的运送历史 (Dil veryHistory) 中。 Deli veryHistory 反映了 Cargo 从创建后经历的各个状态，这 与 DeliverySpecification 恰好 相对,后者描述了目标 。 此外，每个 Cargo 都涉及多个客户 (Customer) ，每个 Customer 承担不同的角色， 比如收货人、付款人等。

### 领域模型

CTS领域模型如图所示。下图展示了对 CTS 需求领域建模得到的领域模型，包括 Cargo,Location,Voyage 以及 Customer 等 4 个限 界上下文 ， 每个限界上下文内都是 一个独立且完整的领域模型 。 其中，Cargo 限界上下文负责管理货物， 包 括货物的计划路线和实际航线等；Voyage 限界上下文负责管理各类运输工具的航行路线； Location 限界上下 文管理物流运输中的位置信息；而 Customer 限界上下文管理和每个货物相关的客户信息。4 个限界上下文协 同合作以实现 CTS 的系统需求。

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-085131.jpg)

以 Cargo 限界上下文为例 如上图所示，Cargo 限界上下文对应领域模型 Cargo ，包含 7 个领域类 。其中，实体 Cargo 以 TrackingID 作为标识，在其生命周期内具有唯一性。 Cargo 的资源库 CargoRepository 封装了所有获取 Cargo 引用所需的 逻辑， 其它领域类经由 CargoRepository 获取 Cargo 对象。 航线说明 (DeliverySpecification) 和运送历史 (DeliveryHistor y)分别管理 Cargo 的计划航线和实际航线信息。 具体 航线(Itinerary)的确定需要满足航线说明， 并且选择航段 (Leg)总规模最小的航线。 此外， 每个 Cargo 的运送历史对应着多个处 理事件(HandlingEvent) 。

### 各限界上下文PIM和CIM

#### cargo

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123220.png)

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123228.png)

#### customer

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123246.png)

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123255.png)

#### location

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123309.png)

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123318.png)


#### voyage

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123416.png)

![](https://markdown-img-bed-common.oss-cn-hangzhou.aliyuncs.com/2020-06-09-123425.png)