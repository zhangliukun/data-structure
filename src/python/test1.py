"""
输入：prices = [8,4,6,2,3]
输出：[4,2,4,2,3]
解释：
商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
商品 3 和 4 都没有折扣。
"""


class Solution(object):
    def finalPrices(self, prices):
        """
        :type prices: List[int]
        :rtype: List[int]
        """
        result = []
        for i in range(len(prices)):
            appended = False
            price = prices[i]
            for j in range(i+1, len(prices)):
                if price >= prices[j]:
                    result.append(price - prices[j])
                    appended = True
                    break
            if not appended:
                result.append(price)

        return result


if __name__ == '__main__':
    # prices = [8, 4, 6, 2, 3]
    # prices = [1,2,3,4,5]
    prices = [10,1,1,6]
    s = Solution()
    print(s.finalPrices(prices))
