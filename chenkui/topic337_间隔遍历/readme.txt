﻿题目描述：小偷又发现了自己盗窃的新地方。 这个区域只有一个入口，称为“根”。 除了根，每个房子只有一个父母的房子。 巡回演出后，聪明的小偷意识到“这个地方的所有房屋都形成了一棵二叉树”。 如果两个直接连接的房屋在同一个晚上被闯入，它将自动联系警方。

确定小偷今晚可以抢劫的最大金额而不警告警察。

例1：

输入：[3,2,3，null，3，null，1]

     3
     / \
    2 3
     \ \
      3 1

输出：7
说明：小偷可以抢夺的最高金额= 3 + 3 + 1 = 7。
例2：

输入：[3,4,5,1,3，null，1]

     3
     / \
    4 5
   / \ \
  1 3 1

输出：9
说明：小偷可抢夺的最高金额= 4 + 5 = 9。