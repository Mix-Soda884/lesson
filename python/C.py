"""
偏差値を割り出すプログラム
学籍番号　22111288
氏名　林浩史
目標：人数と点数を入力してそれを集団として偏差値を割り出すプログラム
入力項目：人数、一人一人の点数
出力項目：合計点数、平均点、ずれ、ずれの合計、一人一人の偏差値とその人が優秀であるか
手順：
1人数入力
2点数を入力
3合計算出
4平均算出
5ズレを算出
6ズレを合計
7分散を算出
8偏差を算出
9偏差値を算出
10一人の偏差値が50を超えているか判定
"""
ninnsuu=int(input("人数を入力してください"))#人数

n = 0
point_sum = 0
point_ave = 0
lis=[]
num = 0
zure_sum = 0
#合計
for i in range(ninnsuu):
    n=n+1
    point=int(input("点数を入力してください"))
    point_sum = point_sum + point
    lis.append(point)
print(lis)
print(f"合計は、{point_sum}" )
#平均
point_ave = point_sum/ninnsuu
point_ave = round(point_ave,2)
print(f"平均は、{point_ave}")


for j in range(ninnsuu):
    point_ave = point_ave
    zure = round((lis[num] - point_ave)**2,1)
    num = num + 1
    print(f'{num}人目のずれの2乗は{zure}')
    zure_sum = zure_sum + zure
print(f'{num}人のずれの2乗の合計は、{round(zure_sum)}')

import math 
point_vari = zure_sum/ninnsuu
standard_deviation = math.sqrt(point_vari)
num = 0
for c in range(ninnsuu):
    hensachi = ((lis[num]-point_ave)/standard_deviation)*10+50
    num = num +1
    print(f"{num}人目の偏差値は{round(hensachi,1)}")
    if(hensachi>50):
        print(f"{num}人目は優秀です")
    elif(hensachi<50):
        print(f"{num}人目は頑張りましょう")
