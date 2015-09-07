package com.junit;

public class JudgeTriangle
{
//普通三角形
private static int NORMAL_TRIANGLE = 0;
//等腰三角形
private static int ISOSCELES_TRIANGLE  = 1;
//等边三角形
private static int EQUILATERAL_TRIANGEL = 2;
//无法构成三角形
private static int ERROR_CODE = -1;
public int getNormalTriangle()
{
return NORMAL_TRIANGLE;
}
public int getIsoscelesTriangle()
{
return ISOSCELES_TRIANGLE;
}
public int getEquilateralTriangle()
{
return EQUILATERAL_TRIANGEL;
}
public int getErrorCode()
{
return ERROR_CODE;
}
public int judgeType(int a,int b,int c)
{
if ((a<=0)||(b<=0)||(c<=0))
{
return ERROR_CODE;
}
if ((a+b<c || Math.abs(a-b)>c) || (b+c<a || Math.abs(b-c)>a) || (a+c<b || Math.abs(a-c)>b))
{
return ERROR_CODE;
}
if (a==b || b==c || c==a)
{
if (a==b && b==c)
{
return EQUILATERAL_TRIANGEL;
}
else
{
return ISOSCELES_TRIANGLE;
}
}
else
{
return NORMAL_TRIANGLE;
}
}
}
