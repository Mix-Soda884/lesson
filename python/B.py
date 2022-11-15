nsum=0
nnsum=0
n=int (input())
for sum in range (n):
  if((sum % 2)==0):
   # print(nnsum)
   # print(nsum)
    print(sum)
    nnsum += sum
  else:
    nsum += sum
print("奇数の和＝",nsum)
print("偶数の和＝",nnsum)