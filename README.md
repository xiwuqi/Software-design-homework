# Software-design-homework

## UML类图简介

UML（统一建模语言）是一种标准的图形语言，用于建模软件系统的结构和行为。UML不是一种编程语言，而是一种设计语言，它允许软件工程师以图形化的方式表示系统的不同方面。UML有多种不同的图，其中类图（Class Diagram）是最常用的一种。

**UML图分为三大类：**

1. 用例图
2. 静态结构图：类图，对象图，包图，组件图，部署图
3. 动态行为图：交互图（时序图与协作图），状态图，活动图

### 类图的基础元素

1. **类（Class）**:
   - 类是UML类图中的主要元素，它用矩形框表示，通常分为三个部分：
     - 第一部分是类名。
     - 第二部分是类的属性或成员变量。（静态成员变量前要加`_`）
     - 第三部分是类的操作或方法。
   - 类名通常用大写字母开始，属性和方法的可见性可以用符号表示（如`+`代表公共，`-`代表私有，`#`代表受保护）。
2. **关系（Relationship）**:
   - 关系描述类与类之间的连接。常见的关系包括：
     - **关联（Association）**：两个类之间的普通连接，表示一个对象与另一个对象有关联。
     - **依赖（Dependency）**：一个类的改变可能影响到另一个类。
     - **聚合（Aggregation）**：一种特殊的关联，表示“整体”和“部分”的关系，但部分可以脱离整体存在。
     - **组合（Composition）**：比聚合更强的“整体-部分”关系，部分不能脱离整体存在。
     - **泛化（Generalization）**：即继承关系，表示一个更一般的类（父类）和一个更特殊的类（子类）之间的关系。
     - **实现（Realization）**：接口和实现该接口的类之间的关系。
3. **多重性（Multiplicity）**:
   - 表示对象间关联的数量。例如，一个教师可以教多个学生，而一个学生通常只属于一个班级，这些关系的数量就可以用多重性来表示。
4. **接口（Interface）**:
   - 接口定义了一组操作，但不实现这些操作。类可以实现（realize）一个或多个接口。

### 创建类图的步骤

1. **识别类**:
   - 通常对应于系统中的实体、概念或对象。
2. **定义属性和方法**:
   - 确定每个类的责任和功能。
3. **建立关系**:
   - 分析类之间如何相互作用，并使用适当的关系类型来表示这些关系。
4. **确定多重性**:
   - 定义每种关系中的对象数量。
5. **检查和优化**:
   - 验证类图是否准确地反映了系统的需求，并对设计进行必要的优化。

### 类图的用途

- 设计系统的静态结构。
- 帮助理解系统中对象的关系和交互。
- 作为系统开发的蓝图，指导编程。
- 提供系统文档，帮助新团队成员理解系统结构。

下面对类的六种关系进行详细讨论

## 依赖（Dependency）

> 依赖(dependency),在代码中,某个类的方法通过局部变量,方法参数或者对静态方法的调用来访问另一个类(被依赖类)中的某些方法来完成一些任务.
> 通俗的讲,**一个类A使用到了另一个类B,那A就依赖于B，即构成了依赖关系**，但是这种使用关系是具有偶然性的、临时性、非常弱的,但是B类的变化会影响到A,是一种使用关系

- 代码:方法的参数,局部变量
- UML:一条虚线,箭头从使用类指向被依赖的类

![依赖关系](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3doYXRsb29raW5nZm9y,size_16,color_FFFFFF,t_70.png)

## 关联（Association）

> 关联(association)关系,用于表示一类对象与另一类对象之间的联系,使一个类知道另一个类的属性和行为.关联关系有单向关联,双向关联,自关联

举例:比如老师和学生,老师知道班里的学生信息,学生不知道老师的信息,老师和学生就是一种单向的关联关系.老师知道学生信息,学生知道老师信息,两者之间就是双向关联关系.老师知道同行老师的信息,老师和老师就是自关联关系.
代码:通常是将一个类的对象作为另一个类的成员变量来实现.
UML:双向关联可以用带两个箭头或者没有箭头的实现来表示.单向关系用带一个箭头的实现从实用类指向被关联类

![双向关联](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614110922867.png)

<p style="text-align: center; font-style: italic; text-shadow: 2px 2px 4px #000000;">双向关联</p>

![单向关联](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614110945309-20231108201219367.png)

<p style="text-align: center; font-style: italic; text-shadow: 2px 2px 4px #000000;">单向关联</p>

<img src="https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/1627027063234_03自关联.png" alt="1627027063234_03自关联" style="zoom: 50%;" />

<p style="text-align: center; font-style: italic; text-shadow: 2px 2px 4px #000000;">自关联</p>

## 聚合（Aggregation）

> 聚合(aggregation)关系是关联关系的一种,是强关联关系,是整合和部分的关系,是`has-a`的关系
> 聚合关系也是通过成员对象来实现,其中**成员对象是整体对象的一部分,但是成员对象可以脱离整体对象单独存在**

- 举例:学校与老师关系,学校中包含老师,如果学校停办了,老师依然存在.

![聚合关系](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614111044973.png)

- UML:聚合关系通常用带空心的菱形实线来表示,菱形指向整体.

## 组合（Composition）

> 组合(composition)关系也是关联关系的一种,也是表示整体和部分的关系,整体对象控制部分对象的生命周期,**一旦整理对象不存在,部分对象也将不存在**.**部分对象不能脱离整理对象单独存在**.

- 举例:头和嘴的关系,没了头,嘴也就不存在了.
- UML:组合关系用带实心的菱形实线来表示,菱形指向整体.

![组合关系](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614111112170.png)

## 泛化（Generalization）

> 泛化(generalization)关系是对象之间耦合度最大的关系,是父类与子类的继承关系,是`is-a`的关系

- 举例:学生类和老师类都是person类的子类.
- UML:泛化关系用带空心三角箭头的实线来表示,箭头从子类指向父类

![泛化关系](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614111135226.png)

## 实现（Realization）

> 实现(realization)关系是接口与实现类之间的关系.

![实现关系](https://cdn.jsdelivr.net/gh/xiwuqi/image-hosting@master/uPic/20190614111156805.png)


