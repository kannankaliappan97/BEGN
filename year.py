def year(n):
if n%4==0 and n%100!=0:
if n%4==0:
print n,"is leap year"
elif n%4!=0:
print n,"is not leap year"
print year(1960)
