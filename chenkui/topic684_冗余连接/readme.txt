﻿题目描述：在这个问题中，树是一个连接的无向图，没有周期。给定输入是以具有N个节点（具有不同值1,2，...，N）的树开始的图，其中添加了一个附加边。添加的边有两个不同的顶点，从1到N中选择，并且不是已经存在的边。

得到的图形作为2D边缘阵列给出。边的每个元素是一对[u，v]，其中u <v，表示连接节点u和v的无向边。返回可以删除的边，以便生成的图是N个节点的树。如果有多个答案，则返回给定2D阵列中最后出现的答案。答案边[u，v]应采用相同的格式，u <v。

例1：
输入：[[1,2]，[1,3]，[2,3]]
产出：[2,3]
说明：给定的无向图将如下所示：
  1
 / \
2  -  3

例2：
输入：[[1,2]，[2,3]，[3,4]，[1,4]，[1,5]]
产出：[1,4]
说明：给定的无向图将如下所示：

注意：
输入2D阵列的大小将介于3和1000之间。
2D数组中表示的每个整数都在1和N之间，其中N是输入数组的大小。

