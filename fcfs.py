bt = [4,2,3,5]
wt = [0]*4

for i in range(1,4):
    wt[i] = wt[i-1] + bt[i-1]

print("Process  BurstTime  WaitingTime")

for i in range(4):
    print("P",i+1,"      \t",bt[i],"      \t",wt[i])

avg = sum(wt)/4
print("Average Waiting Time =",avg)