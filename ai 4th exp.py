from collections import deque
def water_jug_problem(initial_state,goal_state):
    visited=set()
    queue=deque([(initial_state,[])])
    while queue:
        current_state,path=queue.popleft()
        if current_state==goal_state:
            return path
        if current_state in visited:
            continue
        visited.add(current_state)
        a,b=current_state
        queue.append(((3,b),path+['fill 3L jug']))
        queue.append(((a,4),path+['fill 4L jug']))
        queue.append(((0,b),path+['empty 3L jug']))
        queue.append(((a,0),path+['empty 4L jug']))
        pour_amount=min(a,4-b)
        queue.append(((a-pour_amount,b+pour_amount),path+[f'pour{pour_amount}L from 3L jug to 4L jug']))
        pour_amount=min(b,3-a)
        queue.append(((a+pour_amount,b-pour_amount),path+[f'pour{pour_amount}L from 4L jug to 3L jug']))
    return None
initial_state=(0,0)
goal_state=(2,0)
solution=water_jug_problem(initial_state,goal_state)
if solution:
    print("solution path:")
    for step,action in enumerate(solution):
        print(f"step{step+1}:{action}")
else:
    print("no solution found.")
            
