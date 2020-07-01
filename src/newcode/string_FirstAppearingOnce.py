class Solution:
    # 返回对应char

    def __init__(self):
        self.char_set = set()
        self.list = []

    def FirstAppearingOnce(self):
        return self.list[0] if len(self.list)>0 else '#'

    def Insert(self, char):
        if char not in self.char_set:
            self.char_set.add(char)
            self.list.append(char)
        else:
            if char in self.list:
                self.list.remove(char)

if __name__ == '__main__':
    solo = Solution()
    solo.Insert('g')
    solo.Insert('o')
    solo.Insert('o')
    solo.Insert('o')
    # solo.Insert('l')
    # solo.Insert('e')
    print(solo.FirstAppearingOnce())
