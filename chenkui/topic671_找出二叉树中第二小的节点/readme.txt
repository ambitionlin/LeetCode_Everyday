﻿题目描述：给定非空的特殊二叉树，其由具有非负值的节点组成，其中该树中的每个节点具有恰好两个或零个子节点。 如果节点具有两个子节点，则该节点的值是其两个子节点中的较小值。 更正式地说，属性root.val = min（root.left.val，root.right.val）始终成立。

给定这样的二叉树，您需要输出由整个树中所有节点的值组成的集合中的第二个最小值。

如果不存在这样的第二个最小值，则输出-1。

例1：

输入：
    2
    / \
   2 5
      / \
     5 7

输出：5
说明：最小值为2，第二个最小值为5。
 

例2：

输入：
    2
    / \
   2 2

输出：-1
说明：最小值为2，但没有任何第二个最小值。