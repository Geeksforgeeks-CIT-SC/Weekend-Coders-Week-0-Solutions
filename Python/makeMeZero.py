n=int(input())
steps=0
while n:
  if n%2:
    n-=1
  else:
    n=n/2
  steps+=1
print(steps)

#verified in hackerrank