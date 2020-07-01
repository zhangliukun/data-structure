def bfs(node):
    if node is None:
        return
    queue = []
    #nodeSet = set()
    queue.insert(0,node)
    #nodeSet.add(node)
    while queue:
        cur = queue.pop()               # 弹出元素
        print(cur.val)                # 打印元素值
        for next in cur.nexts:          # 遍历元素的邻接节点
            #if next not in nodeSet:     # 若邻接节点没有入过队，加入队列并登记
                #nodeSet.add(next)
                queue.insert(0,next)


#nodeSet = set()
def dfs1(node):
    if node is None:
        return
    #nodeSet.add(node)
    print(node.val)
    #相当于树的前序遍历了，只不过这里把左右子节点放到了nexts的列表中
    for next in node.nexts:
        #if next not in nodeSet:
            dfs1(next)

def dfs(node):
    if node is None:
        return
    nodeSet = set()
    stack = []
    print(node.val)
    nodeSet.add(node)
    stack.append(node)
    while len(stack) > 0:
        cur = stack.pop()               # 弹出最近入栈的节点
        for next in cur.nexts:         # 遍历该节点的邻接节点
            if next not in nodeSet:    # 如果邻接节点不重复
                stack.append(cur)       # 把节点压入
                stack.append(next)      # 把邻接节点压入
                nodeSet.add(next)           # 登记节点
                print(next.val)       # 打印节点值
                break                   # 退出，保持深度优先