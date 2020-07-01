class SubrectangleQueries(object):

    def __init__(self, rectangle):
        """
        :type rectangle: List[List[int]]
        """
        self.rectangle = rectangle


    def updateSubrectangle(self, row1, col1, row2, col2, newValue):
        """
        :type row1: int
        :type col1: int
        :type row2: int
        :type col2: int
        :type newValue: int
        :rtype: None
        """
        rect_rows = len(self.rectangle)
        # if rect_rows == 0:
        #     return
        rect_cols = len(self.rectangle[0])
        # if row1
        for i in range(row1,row2+1):
            for j in range(col1,col2+1):
                self.rectangle[i][j] = newValue

        return

    def getValue(self, row, col):
        """
        :type row: int
        :type col: int
        :rtype: int
        """
        rect_rows = len(self.rectangle)
        rect_cols = len(self.rectangle[0])
        if row < 0 or row >= rect_rows or col <0 or col >= rect_cols:
            return

        return self.rectangle[row][col]



# Your SubrectangleQueries object will be instantiated and called as such:
# obj = SubrectangleQueries(rectangle)
# obj.updateSubrectangle(row1,col1,row2,col2,newValue)
# param_2 = obj.getValue(row,col)

if __name__ == '__main__':

    row = 0
    col = 2
    rectangle = [[1,2,1],[4,3,4],[3,2,1],[1,1,1]]
    obj = SubrectangleQueries(rectangle)

    # [0, 0, 3, 2, 5]
    row1 = 0
    col1 = 0
    row2 = 3
    col2 = 2
    newValue = 5

    param_2 = obj.getValue(row,col)
    print(param_2)
    obj.updateSubrectangle(row1,col1,row2,col2,newValue)
    print(obj.rectangle)
